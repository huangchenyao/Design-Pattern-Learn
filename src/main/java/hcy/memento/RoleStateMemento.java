package hcy.memento;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class RoleStateMemento {
    // 生命力
    private int vitality;
    // 攻击力
    private int attack;
    // 防御力
    private int defense;
}
