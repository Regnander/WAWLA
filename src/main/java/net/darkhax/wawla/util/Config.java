package net.darkhax.wawla.util;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class Config {

    /**
     * The configuration file is used to allow for manipulation of the modification by the user through a
     * .cfg file usually found in the /config folder.
     * 
     * @param cfgFile: The file used for reading/writing the configuration file. Usually obtained from
     *        .getSuggestedConfigurationFile() in the preInit event.
     */
    public Config(File cfgFile) {

        Configuration cfg = new Configuration(cfgFile);
        cfg.load();

        cfg.save();
    }
}