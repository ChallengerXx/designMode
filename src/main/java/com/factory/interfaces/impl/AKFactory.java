package com.factory.interfaces.impl;

import com.factory.interfaces.Bullet;
import com.factory.interfaces.Gun;
import com.factory.interfaces.GunBulletFactory;

/**
 * AK具体工厂
 */
public class AKFactory implements GunBulletFactory {
    public Gun getGun() {
        return new AK();
    }

    public Bullet getBullet() {
        return new AK_Bullet();
    }
}
