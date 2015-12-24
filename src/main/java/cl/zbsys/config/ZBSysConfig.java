package cl.zbsys.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by josebovet on 12/24/15.
 */
@Configuration
@ImportResource(locations = "app-config.xml")
public class ZBSysConfig {
}
