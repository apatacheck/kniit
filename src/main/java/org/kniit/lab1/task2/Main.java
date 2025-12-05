package org.kniit.lab1.task2;

public class Main {
    public static void main(String[] args) {
        String url = "https://test.ru/test/1072/page.jsp";
        SimpleUrl simpleUrl = parseUrl(url);
        System.out.println(simpleUrl.toString());
    }

    public static SimpleUrl parseUrl(String url) {
        SimpleUrl simpleUrl = new SimpleUrl();

        //протокол
        String protocol = url.split("://")[0];
        simpleUrl.setProtocol(protocol);
        String withoutProtocol = url.split("://")[1];
        //адрес
        String address = withoutProtocol.split("/")[0];
        simpleUrl.setAddress(address);
        //доменная зона
        simpleUrl.setDomainZone(address.split("\\.")[1]);
        //имя сайта
        simpleUrl.setSiteName(address.split("\\.")[0]);
        //путь
        String path = "/" + withoutProtocol.split("/", 2)[1].split("\\?")[0];
        simpleUrl.setPath(path);
        //название страницы
        String webpageName = path.substring(path.lastIndexOf("/") + 1);
        simpleUrl.setWebpageName(webpageName);
        //расширение
        simpleUrl.setWebPageExtention(webpageName.split("\\.")[1]);
        //параметры
        String[] lenparam = url.split("\\?");
        if (lenparam.length == 1)
            return simpleUrl;
        String paramsString = url.split("\\?")[1];
        String[] params = paramsString.split("&");
        for (String param : params) {
            String[] clean_param = param.split("=");
            String key = clean_param[0];
            String value = clean_param[1];

            if (key.equals("intParam")) {
                simpleUrl.setIntParam(value);
            } else if (key.equals("doubleParam")) {
                simpleUrl.setDoubleParam(value);
            } else if (key.equals("textParameter")) {
                simpleUrl.setTextParameter(value);
            }
        }

        return simpleUrl;
    }
}