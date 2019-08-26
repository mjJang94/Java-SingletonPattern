package com.stack.singletonpattern.mng;


public class SingletonMng {


    private static SingletonMng instance;

    private String strTestData;

    // 클래스의 인스턴스를 만들어 static으로 선언하고 메모리에 들고있는다.
    public static SingletonMng getInstance() {

        if (instance == null) {
            instance = new SingletonMng();
        }
        return instance;
    }

    // 데이터 접근은 getter/setter로 접근한다
    public String getStrTestData() {
        return strTestData;
    }

    public void setStrTestData(String strTestData) {
        this.strTestData = strTestData;
    }

}
