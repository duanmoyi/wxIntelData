package intel.data.app.api.appkey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/**
 * Created by duanmoyi on 2017/2/18.
 */
@Configuration
public class JuHeApiKey {
    @Autowired
    private Environment environment;

    public String getHealhtyKnowledgeKey(){
        return environment.getProperty("appkey.healhtyKnowledge");
    }
    public String getQRCodeKey(){
        return environment.getProperty("appkey.QRCode");
    }
    public String getTelfareRechargeKey(){
        return environment.getProperty("appkey.telfareRecharge");
    }
    public String getRobotKey(){
        return environment.getProperty("appkey.robot");
    }
    public String getOlivedreamKey(){
        return environment.getProperty("appkey.olivedream");
    }
    public String getPermanentCalendarKey(){
        return environment.getProperty("appkey.permanentCalendar");
    }
    public String getNewsKey(){
        return environment.getProperty("appkey.news");
    }
    public String getCommonalityBusKey(){
        return environment.getProperty("appkey.commonalityBus");
    }
    public String getJokeKey(){
        return environment.getProperty("appkey.joke");
    }
    public String getHistoryTodayKey(){
        return environment.getProperty("appkey.historyToday");
    }
    public String getDistanceBusKey(){
        return environment.getProperty("appkey.distanceBus");
    }
    public String getWeatherForecastKey(){
        return environment.getProperty("appkey.weatherForecast");
    }
}
