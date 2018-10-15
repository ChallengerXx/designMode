package com.test;

import com.factory.interfaces.Bullet;
import com.factory.interfaces.Gun;
import com.factory.interfaces.GunBulletFactory;
import com.factory.interfaces.impl.AKFactory;
import com.factory.interfaces.impl.MA41Factory;

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
