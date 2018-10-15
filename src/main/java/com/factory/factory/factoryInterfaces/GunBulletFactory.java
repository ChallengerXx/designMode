package com.factory.factory.factoryInterfaces;

import com.factory.modelInterfaces.Bullet;
import com.factory.modelInterfaces.Gun;

/**
 * 工厂接口
 */
public interface GunBulletFactory {

    Gun getGun();

    Bullet getBullet();
}
