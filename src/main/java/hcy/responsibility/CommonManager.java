package hcy.responsibility;

public class CommonManager extends Manager {
    public CommonManager(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        if ("请假".equals(request.getRequestType()) && request.getNumber() <= 2) {
            System.out.println(String.format("%s：%s数量%d 被批准",
                    name, request.getRequestContent(), request.getNumber()));
        } else {
            if (superior != null) {
                superior.requestApplications(request);
            }
        }
    }
}
