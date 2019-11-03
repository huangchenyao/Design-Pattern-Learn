package hcy.responsibility;

public class GeneralManager extends Manager {
    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        if ("请假".equals(request.getRequestType())) {
            System.out.println(String.format("%s：%s数量%d 被批准",
                    name, request.getRequestContent(), request.getNumber()));
        } else if ("加薪".equals(request.getRequestType()) && request.getNumber() <= 500) {
            System.out.println(String.format("%s：%s数量%d 被批准",
                    name, request.getRequestContent(), request.getNumber()));
        } else if ("加薪".equals(request.getRequestType()) && request.getNumber() > 500) {
            System.out.println(String.format("%s：%s数量%d 再说吧",
                    name, request.getRequestContent(), request.getNumber()));
        }
    }
}
