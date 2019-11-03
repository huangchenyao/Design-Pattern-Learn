package hcy.responsibility;

import org.junit.Test;

public class ManagerTest {
    @Test
    public void test() {
        CommonManager commonManager = new CommonManager("经理");
        Majordomo majordomo = new Majordomo("总监");
        GeneralManager generalManager = new GeneralManager("总经理");
        commonManager.setSuperior(majordomo);
        majordomo.setSuperior(generalManager);

        Request request1 = new Request();
        request1.setRequestType("请假");
        request1.setRequestContent("xx请假");
        request1.setNumber(1);
        commonManager.requestApplications(request1);

        Request request2 = new Request();
        request2.setRequestType("请假");
        request2.setRequestContent("xx请假");
        request2.setNumber(4);
        commonManager.requestApplications(request2);

        Request request3 = new Request();
        request3.setRequestType("加薪");
        request3.setRequestContent("xx请求加薪");
        request3.setNumber(500);
        commonManager.requestApplications(request3);

        Request request4 = new Request();
        request4.setRequestType("加薪");
        request4.setRequestContent("xx请求加薪");
        request4.setNumber(1000);
        commonManager.requestApplications(request4);
    }
}
