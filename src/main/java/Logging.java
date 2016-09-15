import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;

/**
 * Created by marek on 9/15/16.
 */
public interface Logging {


    default Logger logger(){
        return LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
    }

}
