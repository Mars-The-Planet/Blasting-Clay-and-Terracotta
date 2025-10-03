package com.mars.blastingclay.platform.services;

public interface IPlatformHelper {
    String getPlatformName();

    boolean isModLoaded(String modId);
}
