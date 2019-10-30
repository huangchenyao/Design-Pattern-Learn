package hcy.memento;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GameRole {
    // 生命力
    private int vitality;
    // 攻击力
    private int attack;
    // 防御力
    private int defense;

    public void stateDisplay() {
        System.out.println("角色当前状态：");
        System.out.println("体力：" + this.vitality);
        System.out.println("攻击力：" + this.attack);
        System.out.println("防御力：" + this.defense);
    }

    public void getInitState() {
        this.vitality = 100;
        this.attack = 100;
        this.defense = 100;
    }

    public void fight() {
        this.vitality = 0;
        this.attack = 0;
        this.defense = 0;
    }

    public RoleStateMemento saveState() {
        return new RoleStateMemento(this.vitality, this.attack, this.defense);
    }

    public void recoveryState(RoleStateMemento memento) {
        this.vitality = memento.getVitality();
        this.attack = memento.getAttack();
        this.defense = memento.getDefense();
    }
}
