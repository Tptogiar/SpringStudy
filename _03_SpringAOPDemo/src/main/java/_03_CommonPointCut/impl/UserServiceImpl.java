package _03_CommonPointCut.impl;

import _03_CommonPointCut.UserService;
import org.springframework.stereotype.Service;

/**
 * @author Tptogiar
 * @description
 * @date 2022/1/4 - 16:46
 */
@Service
public class UserServiceImpl  implements UserService {

    public void add() {
        System.out.println(" add() ");

//        int i= 4/0;
    }

}
