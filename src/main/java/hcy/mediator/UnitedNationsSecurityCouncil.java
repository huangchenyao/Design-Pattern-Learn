package hcy.mediator;

import lombok.Setter;

public class UnitedNationsSecurityCouncil extends UnitedNations {
    @Setter
    private USA colleague1;
    @Setter
    private Iraq colleague2;

    @Override
    public void declare(String message, Country colleague) {
        if (colleague == colleague1) {
            colleague2.getMessage(message);
        } else {
            colleague1.getMessage(message);
        }
    }
}
