package com.dream.db.cor.servlet.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author : huzejun
 * @Date: 2021/12/18-1:12
 */
public class Servlet_Main {
    public static void main(String[] args) {
        Request request = new Request();
        request.str = "大家好：). <script>. 欢迎访问 baidu.com , 大家都996 ";
        Response response = new Response();
        response.str = "";


    }
}

interface Filter {
    boolean doFilter(Request request,Response response);
}

class HTMLFilter implements Filter {

    @Override
    public boolean doFilter(Request request, Response response) {
        request.str = request.str.replaceAll("<","[").replaceAll(">","]") + "HTMLFilter()";
        response.str += "--HTMLFilter()";
        return true;
    }
}

class Request {
    String str;
}

class Response {
    String str;
}

class SensitiveFilter implements Filter {

    @Override
    public boolean doFilter(Request request, Response response) {
        request.str = request.str.replaceAll("996","996") + " SensitiveFilter()";
        response.str += "--SensitiveFilter()";
        return true;
    }
}

class FilterChain implements Filter {
    List<Filter> filters = new ArrayList<>();

    public FilterChain add(Filter f){
        filters.add(f);
        return this;
    }



    @Override
    public boolean doFilter(Request request, Response response) {
        for (Filter f : filters) {
            f.doFilter(request,response);
        }

        return true;
    }


}


