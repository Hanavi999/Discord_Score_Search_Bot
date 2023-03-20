package org.example.crawling;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class scoreCrawling2 {

    private static final String url = "https://fow.kr/find/";

    public static String winLoss(String name) {
        Connection conn = Jsoup.connect(url + name);
        //Jsoup 커넥션 생성

        Document document = null;
        try {
            document = conn.get();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        String list = getWinLoss(document);
        return list;
    }

    public static String mode(String name) {
        Connection conn = Jsoup.connect(url + name);
        //Jsoup 커넥션 생성

        Document document = null;
        try {
            document = conn.get();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        String list = getMode(document);
        return list;
    }

    public static String champion(String name) {
        Connection conn = Jsoup.connect(url + name);
        //Jsoup 커넥션 생성

        Document document = null;
        try {
            document = conn.get();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        String list = getChampion(document);
        return list;
    }

    public static String point(String name) {
        Connection conn = Jsoup.connect(url + name);
        //Jsoup 커넥션 생성

        Document document = null;
        try {
            document = conn.get();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        String list = getPoint(document);
        return list;
    }

    public static String time(String name) {
        Connection conn = Jsoup.connect(url + name);
        //Jsoup 커넥션 생성

        Document document = null;
        try {
            document = conn.get();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        String list = getTime(document);
        return list;
    }

    private static String getWinLoss(Document document) {
        String list = "";
        Elements selects = document.select(".table_recent tbody tr td");	//⭐⭐⭐
        int i = 0;
        for (Element select : selects) {
            if(i == 12) {
                list = select.text()
                        .replaceAll("승", "WIN")
                        .replaceAll("패", "LOSS")
                        .replaceAll("R", "RE");
                break;
            }
            i++;
        }
        return list;
    }

    private static String getMode(Document document) {
        String list = "";
        Elements selects = document.select(".table_recent tbody tr td");	//⭐⭐⭐

        int i = 0;
        for (Element select : selects) {
            if(i == 14) {
                list = select.text();
                break;

            }
            i++;
        }
        return list;
    }

    private static String getChampion(Document document) {
        String list = "";
        Elements selects = document.select(".table_recent tbody tr td div img");	//⭐⭐⭐

        int i = 0;
        for (Element select : selects) {
            if(i == 18) {
                list = select.absUrl("src");
                break;
            }
            i++;
        }
        return list;
    }

    private static String getPoint(Document document) {
        String list = "";
        Elements selects = document.select(".table_recent tbody tr td");	//⭐⭐⭐

        int i = 0;
        for (Element select : selects) {
            if(i == 3+12) {
                list = select.text()
                        .replaceAll("더블킬", "")
                        .replaceAll("트리플킬", "")
                        .replaceAll("쿼드라킬", "")
                        .replaceAll("펜타킬", "")
                        .replaceAll("평점 ", "")
                        .replaceFirst(" ", "\n")
                        .replaceAll(" ", "");
                break;
            }
            i++;
        }
        return list;
    }

    private static String getTime(Document document) {
        String list = "";
        Elements selects = document.select(".table_recent tbody tr td");	//⭐⭐⭐

        int i = 0;
        for (Element select : selects) {
            if(i == 9+12) {
                list = select.text();
                break;
            }
            i++;
        }
        return list;
    }

}
