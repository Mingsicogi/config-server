package mins.study.configserver;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
@Profile("default")
public class LocalDatasourceBean extends AbstractDatasourceBean {

    public LocalDatasourceBean() {
        log.info("##### Starting Datasource configuration setting of default profiles");
    }
}
