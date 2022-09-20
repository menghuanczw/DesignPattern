package nio.server;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.util.Iterator;
import java.util.Set;

public class ServerV1 {
    public static void main(String[] args) throws IOException {
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.configureBlocking(false);
        serverSocketChannel.bind(new InetSocketAddress("localhost",8888));

        Selector selector = Selector.open();
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
        boolean isRun = true;
        while (isRun){
            selector.select();
            Set<SelectionKey> set = selector.selectedKeys();
            Iterator<SelectionKey> iterator = set.iterator();
            while(iterator.hasNext()){
                SelectionKey key = iterator.next();
                iterator.remove();
                if (key.isAcceptable()){
                    SocketChannel socketChannel = serverSocketChannel.accept();
                    socketChannel.configureBlocking(false);
                    socketChannel.register(selector,SelectionKey.OP_WRITE);
                }
                if (key.isWritable()){
                    SocketChannel socketChannel = (SocketChannel) key.channel();
                    String filePath = "C:/Users/czw/Desktop/myBatis-plus.txt";
                    FileInputStream file = new FileInputStream(filePath);// 此处添加文件路径
                    FileChannel fileChannel = file.getChannel();
                    ByteBuffer byteBuffer = ByteBuffer.allocate(500*1024*1024);
                    while (fileChannel.position() < fileChannel.size()) {
                        fileChannel.read(byteBuffer);
                        byteBuffer.flip();
                        while (byteBuffer.hasRemaining()){
                            socketChannel.write(byteBuffer);
                        }
                        byteBuffer.clear();
                        System.out.println(fileChannel.position() + "" + fileChannel.size());
                    }
                    System.out.println("操作结束");
                    socketChannel.close();
                    }
                }
        }
    }

}
