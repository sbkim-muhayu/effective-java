package chapter2.item1;

public abstract class MyStock {

    public static KakaoGames kakaoGames = new KakaoGames();
    public static LGDisplay lgDisplay = new LGDisplay();
    public static DongkukSteel dongkukSteel = new DongkukSteel();

    public enum Subject {
        DISPLAY,
        STEEL,
        GAME
    }

    public abstract int getPrice();

    //객체를 새로 생성하는 것을 보장
    public MyStock create(Subject subject){

        if(subject.equals(Subject.DISPLAY))
            return new LGDisplay();
        else if(subject.equals(Subject.GAME))
            return new KakaoGames();
        else if(subject.equals(Subject.STEEL))
            return new DongkukSteel();
        else
            throw new IllegalArgumentException();
    }

    //미리 만들어둔 객체 반환
    public MyStock from(Subject subject){

        if(subject.equals(Subject.DISPLAY))
            return lgDisplay;
        else if(subject.equals(Subject.GAME))
            return kakaoGames;
        else if(subject.equals(Subject.STEEL))
            return dongkukSteel;
        else
            throw new IllegalArgumentException();
    }

    // TODO: 2021-12-15 객체가 몇 주를 가지고 있는지도 표현하고 싶은데(지금은 그냥 1주) 어떤 구조가 좋을지.. -> 총 가격 가져오는 메소드도 추가
}
