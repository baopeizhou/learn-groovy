package org.bob.learn.groovy.service;

/**
 * 保费计算服务
 */
public interface PremiumService {

    static PremiumService PREMIUM_SERVICE = Factory.selectImpl();

    static long calculatePremium(){
        return PREMIUM_SERVICE.calculatePremiumImpl();
    }

    long calculatePremiumImpl();

    class Factory
    {
        private static PremiumService selectImpl() {
            String os = System.getProperty("os.name");
            if ("Mac OS X".equals(os)) {
                return null;
            }

            return null;
        }
    }
}
