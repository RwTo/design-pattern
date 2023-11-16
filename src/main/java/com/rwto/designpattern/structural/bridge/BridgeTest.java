package com.rwto.designpattern.structural.bridge;

/**
 * 银行转账系统
 * 转账方式：手机转账，柜台转账，ATM转账
 * 卡类型：普通一类卡，普通二类卡，金卡
 * 两种维度，且可能存在扩展，适用于桥接模式
 * 如果使用普通继承，需要3*3个类，且单个维度每增加一种，都要增加3个类，很容易类爆炸
 * @author renmw
 * @create 2023/11/16 10:40
 **/
public class BridgeTest {
    public static void main(String[] args) {

        /*金卡手机转账*/
        GoldCard goldCard = new GoldCard(new PhoneTransfer());
        goldCard.transfer();

        /*金卡ATM转账*/
        goldCard.setTransfer(new ATMTransfer());
        goldCard.transfer();

        /*
        * 转账方式和卡类型两个维度，可以自由组合，维度扩展，只需要增加对应的一个类
        * 用组合代替继承，类似装饰模式，抽象类继承实现接口 就是装饰模式了
        * 因为桥接模式的场景没有装饰模式那么高的耦合，所以不需要继承抽象类
        * 桥接模式强调的是组合关系，两个维度平级
        * 装饰模式强调增强，以一个实体为主，逐渐增加新的装饰，有递归的思想在。
        * */
    }
}
