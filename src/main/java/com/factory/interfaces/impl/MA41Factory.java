package com.factory.interfaces.impl;

import com.factory.interfaces.Bullet;
import com.factory.interfaces.Gun;
import com.factory.interfaces.GunBulletFactory;

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
