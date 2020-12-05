package mins.study.configserver;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
@Profile({"test", "test-qa1"})
public class TestDataSourceBean extends AbstractDatasourceBean{

    public TestDataSourceBean() {
        log.info("##### Starting Datasource configuration setting of test profiles");
    }
}
