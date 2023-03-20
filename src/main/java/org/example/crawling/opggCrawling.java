package org.example.crawling;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class opggCrawling {

    private static final String url = "https://www.op.gg/champions?region=kr&tier=platinum_plus&position=";

    public static String rank(String line, String champ) {
        Connection conn = Jsoup.connect(url + line);
        //Jsoup 커넥션 생성
        String champion = "";
        switch (champ) {
            case "아칼리": champion = "Akali";
                break;
            case "가렌" : champion = "Garen";
                break;
            case "갈리오" : champion = "Galio";
                break;
            case "갱플랭크" : champion = "Gangplank";
                break;
            case "그라가스" : champion = "Gragas";
                break;
            case "그레이브즈" : champion = "Graves";
                break;
            case "그웬" : champion = "Gwen";
                break;
            case "나르" : champion = "Gnar";
                break;
            case "나미" : champion = "Nami";
                break;
            case "나서스" : champion = "Nasus";
                break;
            case "노틸러스" : champion = "Nautilus";
                break;
            case "녹턴": champion = "Nocturne";
                break;
            case "누누" : champion = "Nunu";
                break;
            case "니달리" : champion = "Nidalee";
                break;
            case "니코" : champion = "Neeko";
                break;
            case "닐라" : champion = "Nilah";
                break;
            case "다리우스" : champion = "Darius";
                break;
            case "다이애나" : champion = "Diana";
                break;
            case "드레이븐" : champion = "Draven";
                break;
            case "라이즈" : champion = "Ryze";
                break;
            case "라칸" : champion = "Rakan";
                break;
            case "람머스" : champion = "Rammus";
                break;
            case "럭스": champion = "Lux";
                break;
            case "럼블" : champion = "Rumble";
                break;
            case "레나타" : champion = "Renata";
                break;
            case "레넥톤" : champion = "Renekton";
                break;
            case "레오나" : champion = "Leona";
                break;
            case "렉사이" : champion = "Reksai";
                break;
            case "렐" : champion = "Rell";
                break;
            case "렝가" : champion = "Rengar";
                break;
            case "루시안" : champion = "Lucian";
                break;
            case "룰루" : champion = "Lulu";
                break;
            case "르블랑" : champion = "Leblanc";
                break;
            case "리 신": champion = "LeeSin";
                break;
            case "리븐": champion = "Riven";
                break;
            case "리산드라" : champion = "Lissandra";
                break;
            case "릴리아" : champion = "Lillia";
                break;
            case "마스터이" : champion = "Masteryi";
                break;
            case "마오카이" : champion = "Maokai";
                break;
            case "말자하" : champion = "Malzahar";
                break;
            case "말파이트" : champion = "Malphite";
                break;
            case "모데카이저" : champion = "Mordekaiser";
                break;
            case "모르가나" : champion = "Morgana";
                break;
            case "문도" : champion = "Drmundo";
                break;
            case "미스포츈" : champion = "Missfortune";
                break;
            case "바드": champion = "Bard";
                break;
            case "바루스" : champion = "Varus";
                break;
            case "바이" : champion = "Vi";
                break;
            case "베이가" : champion = "Veigar";
                break;
            case "베인" : champion = "Vayne";
                break;
            case "벡스" : champion = "Vex";
                break;
            case "벨베스" : champion = "Belveth";
                break;
            case "벨코즈" : champion = "Velkoz";
                break;
            case "볼리베어" : champion = "Volibear";
                break;
            case "브라움" : champion = "Braum";
                break;
            case "브랜드" : champion = "Brand";
                break;
            case "블라디미르": champion = "Vladimir";
                break;
            case "블리츠크랭크" : champion = "Blitzcrank";
                break;
            case "비에고" : champion = "Viego";
                break;
            case "빅토르" : champion = "Viktor";
                break;
            case "뽀삐" : champion = "Poppy";
                break;
            case "사미라" : champion = "Samira";
                break;
            case "사이온" : champion = "Sion";
                break;
            case "사일러스" : champion = "Sylas";
                break;
            case "샤코" : champion = "Shaco";
                break;
            case "세나" : champion = "Senna";
                break;
            case "세라핀" : champion = "Seraphine";
                break;
            case "세주아니": champion = "Sejuani";
                break;
            case "세트": champion = "Sett";
                break;
            case "소나" : champion = "Sona";
                break;
            case "소라카" : champion = "Soraka";
                break;
            case "쉔" : champion = "Shen";
                break;
            case "쉬바나" : champion = "Shyvana";
                break;
            case "스웨인" : champion = "Swain";
                break;
            case "스카너" : champion = "Skarner";
                break;
            case "시비르" : champion = "Sivir";
                break;
            case "신짜오" : champion = "Xinzhao";
                break;
            case "신드라" : champion = "Syndra";
                break;
            case "신지드" : champion = "Singed";
                break;
            case "쓰레쉬": champion = "Thresh";
                break;
            case "아리" : champion = "Ahri";
                break;
            case "아무무" : champion = "Amumu";
                break;
            case "아우렐리온 솔" : champion = "Aurelionsol";
                break;
            case "아이번" : champion = "Ivern";
                break;
            case "아지르" : champion = "Azir";
                break;
            case "아크샨" : champion = "Akshan";
                break;
            case "아트록스" : champion = "Aatrox";
                break;
            case "아펠리오스" : champion = "Aphelios";
                break;
            case "알리스타" : champion = "Alistar";
                break;
            case "애니" : champion = "Annie";
                break;
            case "애니비아": champion = "Anivia";
                break;
            case "애쉬" : champion = "Ashe";
                break;
            case "야스오" : champion = "Yasuo";
                break;
            case "에코" : champion = "Ekko";
                break;
            case "엘리스" : champion = "Elise";
                break;
            case "오공" : champion = "Monkeyking";
                break;
            case "오른" : champion = "Ornn";
                break;
            case "오리아나" : champion = "Orianna";
                break;
            case "올라프" : champion = "Olaf";
                break;
            case "요네" : champion = "Yone";
                break;
            case "요릭" : champion = "Yorick";
                break;
            case "우디르": champion = "Udyr";
                break;
            case "우르곳": champion = "Urgot";
                break;
            case "워윅" : champion = "Warwick";
                break;
            case "유미" : champion = "Yuumi";
                break;
            case "이렐리아" : champion = "Irelia";
                break;
            case "이블린" : champion = "Evelynn";
                break;
            case "이즈리얼" : champion = "Ezreal";
                break;
            case "일라오이" : champion = "Illaoi";
                break;
            case "자르반 4세" : champion = "Jarvaniv";
                break;
            case "자야" : champion = "Xayah";
                break;
            case "자이라" : champion = "Zyra";
                break;
            case "자크" : champion = "Zac";
                break;
            case "잔나": champion = "Janna";
                break;
            case "잭스" : champion = "Jax";
                break;
            case "제드" : champion = "Zed";
                break;
            case "제라스" : champion = "Xerath";
                break;
            case "제리" : champion = "Zeri";
                break;
            case "제이스" : champion = "Jayce";
                break;
            case "조이" : champion = "Zoe";
                break;
            case "직스" : champion = "Ziggs";
                break;
            case "진" : champion = "Jhin";
                break;
            case "질리언" : champion = "Zilean";
                break;
            case "징크스" : champion = "Jinx";
                break;
            case "초가스": champion = "Chogath";
                break;
            case "카르마" : champion = "Karma";
                break;
            case "카밀" : champion = "Camille";
                break;
            case "카사딘" : champion = "Kassadin";
                break;
            case "카서스" : champion = "Karthus";
                break;
            case "카시오페아" : champion = "Cassiopeia";
                break;
            case "카이사" : champion = "Kaisa";
                break;
            case "카직스" : champion = "Khazix";
                break;
            case "카타리나" : champion = "Katarina";
                break;
            case "칼리스타" : champion = "Kalista";
                break;
            case "케넨" : champion = "Kennen";
                break;
            case "케이틀린": champion = "Caitlyn";
                break;
            case "케인" : champion = "Kayn";
                break;
            case "케일" : champion = "Kayle";
                break;
            case "코그모" : champion = "Kogmaw";
                break;
            case "코르키" : champion = "Corki";
                break;
            case "퀸" : champion = "Quinn";
                break;
            case "크산테" : champion = "Ksante";
                break;
            case "클레드" : champion = "Kled";
                break;
            case "키아나": champion = "Qiyana";
                break;
            case "킨드레드" : champion = "Kindred";
                break;
            case "타릭" : champion = "Taric";
                break;
            case "탈론" : champion = "Talon";
                break;
            case "탈리야" : champion = "Taliyah";
                break;
            case "탐 켄치" : champion = "Tahmkench";
                break;
            case "트런들" : champion = "Trundle";
                break;
            case "트리스타나" : champion = "Tristana";
                break;
            case "트린다미어" : champion = "Tryndamere";
                break;
            case "트위스티드 페이트" : champion = "Twistedfate";
                break;
            case "트위치" : champion = "Twitch";
                break;
            case "티모": champion = "Teemo";
                break;
            case "파이크" : champion = "Pyke";
                break;
            case "판테온" : champion = "Pantheon";
                break;
            case "피들스틱" : champion = "Fiddlesticks";
                break;
            case "피오라" : champion = "Fiora";
                break;
            case "피즈" : champion = "Fizz";
                break;
            case "하이머딩거" : champion = "Heimerdinger";
                break;
            case "헤카림" : champion = "Hecarim";
                break;
            default:
                break;
        }

        Document document = null;
        try {
            document = conn.get();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        String list = getRank(document, champion);
        return list;
    }

    public static String champImg(String line, String champ) {
        Connection conn = Jsoup.connect(url + line);
        //Jsoup 커넥션 생성

        String champion = "";
        switch (champ) {
            case "아칼리": champion = "Akali";
                break;
            case "가렌" : champion = "Garen";
                break;
            case "갈리오" : champion = "Galio";
                break;
            case "갱플랭크" : champion = "Gangplank";
                break;
            case "그라가스" : champion = "Gragas";
                break;
            case "그레이브즈" : champion = "Graves";
                break;
            case "그웬" : champion = "Gwen";
                break;
            case "나르" : champion = "Gnar";
                break;
            case "나미" : champion = "Nami";
                break;
            case "나서스" : champion = "Nasus";
                break;
            case "노틸러스" : champion = "Nautilus";
                break;
            case "녹턴": champion = "Nocturne";
                break;
            case "누누" : champion = "Nunu";
                break;
            case "니달리" : champion = "Nidalee";
                break;
            case "니코" : champion = "Neeko";
                break;
            case "닐라" : champion = "Nilah";
                break;
            case "다리우스" : champion = "Darius";
                break;
            case "다이애나" : champion = "Diana";
                break;
            case "드레이븐" : champion = "Draven";
                break;
            case "라이즈" : champion = "Ryze";
                break;
            case "라칸" : champion = "Rakan";
                break;
            case "람머스" : champion = "Rammus";
                break;
            case "럭스": champion = "Lux";
                break;
            case "럼블" : champion = "Rumble";
                break;
            case "레나타" : champion = "Renata";
                break;
            case "레넥톤" : champion = "Renekton";
                break;
            case "레오나" : champion = "Leona";
                break;
            case "렉사이" : champion = "Reksai";
                break;
            case "렐" : champion = "Rell";
                break;
            case "렝가" : champion = "Rengar";
                break;
            case "루시안" : champion = "Lucian";
                break;
            case "룰루" : champion = "Lulu";
                break;
            case "르블랑" : champion = "Leblanc";
                break;
            case "리 신": champion = "LeeSin";
                break;
            case "리븐": champion = "Riven";
                break;
            case "리산드라" : champion = "Lissandra";
                break;
            case "릴리아" : champion = "Lillia";
                break;
            case "마스터이" : champion = "masteryi";
                break;
            case "마오카이" : champion = "Maokai";
                break;
            case "말자하" : champion = "Malzahar";
                break;
            case "말파이트" : champion = "Malphite";
                break;
            case "모데카이저" : champion = "Mordekaiser";
                break;
            case "모르가나" : champion = "Morgana";
                break;
            case "문도" : champion = "Drmundo";
                break;
            case "미스포츈" : champion = "Missfortune";
                break;
            case "바드": champion = "Bard";
                break;
            case "바루스" : champion = "Varus";
                break;
            case "바이" : champion = "Vi";
                break;
            case "베이가" : champion = "Veigar";
                break;
            case "베인" : champion = "Vayne";
                break;
            case "벡스" : champion = "Vex";
                break;
            case "벨베스" : champion = "Belveth";
                break;
            case "벨코즈" : champion = "Velkoz";
                break;
            case "볼리베어" : champion = "Volibear";
                break;
            case "브라움" : champion = "Braum";
                break;
            case "브랜드" : champion = "Brand";
                break;
            case "블라디미르": champion = "Vladimir";
                break;
            case "블리츠크랭크" : champion = "Blitzcrank";
                break;
            case "비에고" : champion = "Viego";
                break;
            case "빅토르" : champion = "Viktor";
                break;
            case "뽀삐" : champion = "Poppy";
                break;
            case "사미라" : champion = "Samira";
                break;
            case "사이온" : champion = "Sion";
                break;
            case "사일러스" : champion = "Sylas";
                break;
            case "샤코" : champion = "Shaco";
                break;
            case "세나" : champion = "Senna";
                break;
            case "세라핀" : champion = "Seraphine";
                break;
            case "세주아니": champion = "Sejuani";
                break;
            case "세트": champion = "Sett";
                break;
            case "소나" : champion = "Sona";
                break;
            case "소라카" : champion = "Soraka";
                break;
            case "쉔" : champion = "Shen";
                break;
            case "쉬바나" : champion = "Shyvana";
                break;
            case "스웨인" : champion = "Swain";
                break;
            case "스카너" : champion = "Skarner";
                break;
            case "시비르" : champion = "Sivir";
                break;
            case "신짜오" : champion = "Xinzhao";
                break;
            case "신드라" : champion = "Syndra";
                break;
            case "신지드" : champion = "Singed";
                break;
            case "쓰레쉬": champion = "Thresh";
                break;
            case "아리" : champion = "Ahri";
                break;
            case "아무무" : champion = "Amumu";
                break;
            case "아우렐리온 솔" : champion = "Aurelionsol";
                break;
            case "아이번" : champion = "Ivern";
                break;
            case "아지르" : champion = "Azir";
                break;
            case "아크샨" : champion = "Akshan";
                break;
            case "아트록스" : champion = "Aatrox";
                break;
            case "아펠리오스" : champion = "Aphelios";
                break;
            case "알리스타" : champion = "Alistar";
                break;
            case "애니" : champion = "Annie";
                break;
            case "애니비아": champion = "Anivia";
                break;
            case "애쉬" : champion = "Ashe";
                break;
            case "야스오" : champion = "Yasuo";
                break;
            case "에코" : champion = "Ekko";
                break;
            case "엘리스" : champion = "Elise";
                break;
            case "오공" : champion = "Monkeyking";
                break;
            case "오른" : champion = "Ornn";
                break;
            case "오리아나" : champion = "Orianna";
                break;
            case "올라프" : champion = "Olaf";
                break;
            case "요네" : champion = "Yone";
                break;
            case "요릭" : champion = "Yorick";
                break;
            case "우디르": champion = "Udyr";
                break;
            case "우르곳": champion = "Urgot";
                break;
            case "워윅" : champion = "Warwick";
                break;
            case "유미" : champion = "Yuumi";
                break;
            case "이렐리아" : champion = "Irelia";
                break;
            case "이블린" : champion = "Evelynn";
                break;
            case "이즈리얼" : champion = "Ezreal";
                break;
            case "일라오이" : champion = "Illaoi";
                break;
            case "자르반 4세" : champion = "Jarvaniv";
                break;
            case "자야" : champion = "Xayah";
                break;
            case "자이라" : champion = "Zyra";
                break;
            case "자크" : champion = "Zac";
                break;
            case "잔나": champion = "Janna";
                break;
            case "잭스" : champion = "Jax";
                break;
            case "제드" : champion = "Zed";
                break;
            case "제라스" : champion = "Xerath";
                break;
            case "제리" : champion = "Zeri";
                break;
            case "제이스" : champion = "Jayce";
                break;
            case "조이" : champion = "Zoe";
                break;
            case "직스" : champion = "Ziggs";
                break;
            case "진" : champion = "Jhin";
                break;
            case "질리언" : champion = "Zilean";
                break;
            case "징크스" : champion = "Jinx";
                break;
            case "초가스": champion = "Chogath";
                break;
            case "카르마" : champion = "Karma";
                break;
            case "카밀" : champion = "Camille";
                break;
            case "카사딘" : champion = "Kassadin";
                break;
            case "카서스" : champion = "Karthus";
                break;
            case "카시오페아" : champion = "Cassiopeia";
                break;
            case "카이사" : champion = "Kaisa";
                break;
            case "카직스" : champion = "Khazix";
                break;
            case "카타리나" : champion = "Katarina";
                break;
            case "칼리스타" : champion = "Kalista";
                break;
            case "케넨" : champion = "Kennen";
                break;
            case "케이틀린": champion = "Caitlyn";
                break;
            case "케인" : champion = "Kayn";
                break;
            case "케일" : champion = "Kayle";
                break;
            case "코그모" : champion = "Kogmaw";
                break;
            case "코르키" : champion = "Corki";
                break;
            case "퀸" : champion = "Quinn";
                break;
            case "크산테" : champion = "Ksante";
                break;
            case "클레드" : champion = "Kled";
                break;
            case "키아나": champion = "Qiyana";
                break;
            case "킨드레드" : champion = "Kindred";
                break;
            case "타릭" : champion = "Taric";
                break;
            case "탈론" : champion = "Talon";
                break;
            case "탈리야" : champion = "Taliyah";
                break;
            case "탐 켄치" : champion = "Tahmkench";
                break;
            case "트런들" : champion = "Trundle";
                break;
            case "트리스타나" : champion = "Tristana";
                break;
            case "트린다미어" : champion = "Tryndamere";
                break;
            case "트위스티드 페이트" : champion = "Twistedfate";
                break;
            case "트위치" : champion = "Twitch";
                break;
            case "티모": champion = "Teemo";
                break;
            case "파이크" : champion = "Pyke";
                break;
            case "판테온" : champion = "Pantheon";
                break;
            case "피들스틱" : champion = "Fiddlesticks";
                break;
            case "피오라" : champion = "Fiora";
                break;
            case "피즈" : champion = "Fizz";
                break;
            case "하이머딩거" : champion = "Heimerdinger";
                break;
            case "헤카림" : champion = "Hecarim";
                break;
            default:
                break;
        }


        Document document = null;
        try {
            document = conn.get();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        String list = getChampImg(document, champion);
        return list;
    }

    public static String version(String line) {
        Connection conn = Jsoup.connect(url + line);
        //Jsoup 커넥션 생성


        Document document = null;
        try {
            document = conn.get();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        String list = getVersion(document);
        return list;
    }

    private static String getRank(Document document, String champ) {
        String list = "";
        String rank = "";
        Elements selects = document.select(".e1oulx2j7 tbody tr");	//⭐⭐⭐

        for (Element select : selects) {
            list = select.text();
           if(list.contains(champ)) {
               rank = select.text().substring(select.text().lastIndexOf(champ)+champ.length())
                       .replaceFirst("& Willump ", "")
                       .replaceFirst(" Glasc", "")
                       .replaceFirst(" ", "**Tier**:")
                       .replaceFirst(" ", "\n**WIN**:")
                       .replaceFirst(" ", "\n**PICK**:")
                       .replaceFirst(" ", "\n**BAN**:")
                       .replaceAll(":", " : ")
                       .replace("WIN", "WIN RATE")
                       .replace("PICK", "PICK RATE")
                       .replace("BAN", "BAN RATE");
               System.out.println(rank);
               break;
           }
        }

        return rank;
    }

    private static String getChampImg(Document document, String champ) {
        String list = "";
        String img = "";
        Elements selects = document.select(".e1oulx2j6 img");

        for(Element select : selects) {
            list = select.absUrl("src");
            if(list.contains(champ)) {
                img = list;
                System.out.println(list);
            }
        }

        return img;
    }

    private static String getVersion(Document document) {
        String list = "";
        String img = "";
        Elements selects = document.select(".e5qh6tw2 span");

        for(Element select : selects) {
            list = select.text().replace("English", "");
            System.out.println(list);
        }

        return list;
    }

    public static void main(String[] args) {
        rank("top", "아크샨");
        version("top");
    }



}
