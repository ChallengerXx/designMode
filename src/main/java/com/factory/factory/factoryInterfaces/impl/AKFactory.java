package com.factory.factory.factoryInterfaces.impl;

import com.factory.modelInterfaces.Bullet;
import com.factory.modelInterfaces.Gun;
import com.factory.factory.factoryInterfaces.GunBulletFactory;
import com.factory.modelInterfaces.impl.AK;
import com.factory.modelInterfaces.impl.AK_Bullet;

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
