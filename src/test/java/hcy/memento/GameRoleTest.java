package hcy.memento;

import org.junit.Test;

public class GameRoleTest {
    @Test
    public void test() {
        GameRole gameRole = new GameRole();
        gameRole.getInitState();
        gameRole.stateDisplay();

        RoleStateCaretaker stateAdmin = new RoleStateCaretaker();
        stateAdmin.setMemento(gameRole.saveState());

        gameRole.fight();
        gameRole.stateDisplay();

        gameRole.recoveryState(stateAdmin.getMemento());
        gameRole.stateDisplay();
    }
}