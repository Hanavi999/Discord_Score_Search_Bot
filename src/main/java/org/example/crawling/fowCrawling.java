package org.example.crawling;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class fowCrawling {

    private static final String url = "https://fow.kr/find/";

    public static CharSequence rank(String name) {
        Connection conn = Jsoup.connect(url+name);
        //Jsoup 커넥션 생성

        Document document = null;
        try {
            document = conn.get();
            //url의 내용을 HTML Document 객체로 가져온다.
            //https://jsoup.org/apidocs/org/jsoup/nodes/Document.html 참고
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        String list = getDataList(document);
        return list;
    }

    public static CharSequence tier(String name) {
        Connection conn = Jsoup.connect(url+name);
        //Jsoup 커넥션 생성

        Document document = null;
        try {
            document = conn.get();
            //url의 내용을 HTML Document 객체로 가져온다.
            //https://jsoup.org/apidocs/org/jsoup/nodes/Document.html 참고
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        String list = getTier(document);
        return list;
    }

    public static CharSequence point(String name) {
        Connection conn = Jsoup.connect(url+name);
        //Jsoup 커넥션 생성

        Document document = null;
        try {
            document = conn.get();
            //url의 내용을 HTML Document 객체로 가져온다.
            //https://jsoup.org/apidocs/org/jsoup/nodes/Document.html 참고
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        String list = getPoint(document);
        return list;
    }

    public static CharSequence promotion(String name) {
        Connection conn = Jsoup.connect(url+name);
        //Jsoup 커넥션 생성

        Document document = null;
        try {
            document = conn.get();
            //url의 내용을 HTML Document 객체로 가져온다.
            //https://jsoup.org/apidocs/org/jsoup/nodes/Document.html 참고
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        String list = getPromotion(document);
        return list;
    }

    public static CharSequence TierImg(String name) {
        Connection conn = Jsoup.connect(url+name);
        //Jsoup 커넥션 생성

        Document document = null;
        try {
            document = conn.get();
            //url의 내용을 HTML Document 객체로 가져온다.
            //https://jsoup.org/apidocs/org/jsoup/nodes/Document.html 참고
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        String list = getTierImg(document);
        return list;
    }

    public static CharSequence profileImg(String name) {
        Connection conn = Jsoup.connect(url+name);
        //Jsoup 커넥션 생성

        Document document = null;
        try {
            document = conn.get();
            //url의 내용을 HTML Document 객체로 가져온다.
            //https://jsoup.org/apidocs/org/jsoup/nodes/Document.html 참고
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        String list = getProfileImg(document);
        return list;
    }


    private static String getDataList(Document document) {
        String list = "";
        Elements selects = document.select(".table_summary div a");	//⭐⭐⭐
        //select 메서드 안에 css selector를 작성하여 Elements를 가져올 수 있다.

        for (Element select : selects) {
            list = list + select.text();
            break;
            //https://jsoup.org/apidocs/org/jsoup/nodes/Element.html 참고
        }
        return list;
    }

    private static String getTier(Document document) {
        String list = "";
        Elements selects = document.select(".table_summary div b");	//⭐⭐⭐
        //select 메서드 안에 css selector를 작성하여 Elements를 가져올 수 있다.
        int i  = 0;
        for (Element select : selects) {
            if(i == 1) {
                list = list + select.text();
                break;
            }
            i = i + 1;
            //https://jsoup.org/apidocs/org/jsoup/nodes/Element.html 참고
        }
        return list;
    }

    private static String getPoint(Document document) {
        String list = "";
        Elements selects = document.select(".table_summary div");	//⭐⭐⭐
        //select 메서드 안에 css selector를 작성하여 Elements를 가져올 수 있다.
        for (Element select : selects) {
            String sub = select.text().substring(select.text().lastIndexOf("트:")+2, select.text().lastIndexOf("승급"));
            list = list + sub;
            break;
            //https://jsoup.org/apidocs/org/jsoup/nodes/Element.html 참고
        }
        return list;
    }

    private static String getPromotion(Document document) {
        String list = "";
        Elements selects = document.select(".table_summary div");	//⭐⭐⭐
        //select 메서드 안에 css selector를 작성하여 Elements를 가져올 수 있다.
        for (Element select : selects) {
            String sub = select.text().substring(select.text().lastIndexOf("-")+1);
            list = list + sub;
            break;
            //https://jsoup.org/apidocs/org/jsoup/nodes/Element.html 참고
        }
        return list;
    }

    private static String getTierImg(Document document) {
        String list = "";
        Elements selects = document.select(".table_summary div div img");	//⭐⭐⭐
        //select 메서드 안에 css selector를 작성하여 Elements를 가져올 수 있다.
        for (Element select : selects) {
            list = list + select.absUrl("src");
            break;
            //https://jsoup.org/apidocs/org/jsoup/nodes/Element.html 참고
        }
        return list;
    }

    private static String getProfileImg(Document document) {
        String list = "";
        Elements selects = document.select(".profile div img");	//⭐⭐⭐
        //select 메서드 안에 css selector를 작성하여 Elements를 가져올 수 있다.
        for (Element select : selects) {
            list = list + select.absUrl("src");
            break;
            //https://jsoup.org/apidocs/org/jsoup/nodes/Element.html 참고
        }
        return list;
    }


}
