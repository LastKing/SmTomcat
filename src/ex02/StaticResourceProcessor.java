package ex02;

import java.io.IOException;

/**
 * 类用来提供静态资源请求
 * Created by toonew on 16-5-10.
 */
public class StaticResourceProcessor {

    public void process(Request request, Response response) {
        try {
            response.sendStaticResource();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
