package com.test;

import com.factory.modelInterfaces.Bullet;
import com.factory.modelInterfaces.Gun;
import com.factory.factory.factoryInterfaces.GunBulletFactory;
import com.factory.factory.factoryInterfaces.impl.AKFactory;
import com.factory.factory.factoryInterfaces.impl.MA41Factory;

public class GunBulletFactoryTest {

    public static void main(String[] args) {
        GunBulletFactory factory;
        Gun gun;
        Bullet bullet;

        factory = new AKFactory();
        gun = factory.getGun();
        bullet = factory.getBullet();

        gun.shooting();
        bullet.loud();

        System.out.println("============================");
        factory = new MA41Factory();
        gun = factory.getGun();
        bullet = factory.getBullet();

        gun.shooting();
        bullet.loud();
    }
}
