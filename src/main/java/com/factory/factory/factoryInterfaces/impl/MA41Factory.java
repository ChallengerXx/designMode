package com.factory.factory.factoryInterfaces.impl;

import com.factory.modelInterfaces.Bullet;
import com.factory.modelInterfaces.Gun;
import com.factory.factory.factoryInterfaces.GunBulletFactory;
import com.factory.modelInterfaces.impl.MA41;
import com.factory.modelInterfaces.impl.MA41_Bullet;

/**
 * MA41具体工厂
 */
public class MA41Factory implements GunBulletFactory {
    public Gun getGun() {
        return new MA41();
    }

    public Bullet getBullet() {
        return new MA41_Bullet();
    }
}
