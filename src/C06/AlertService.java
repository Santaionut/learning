package C06;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

class AlertService {
    private final MapAlertDAO storage = new MapAlertDAO();
    public MapAlertDAO alertDAO;

    AlertService(MapAlertDAO alertDAO){
        this.alertDAO = alertDAO;
    }

    public UUID raiseAlert() {
        System.out.println("raise");
        return alertDAO.addAlert(new Date());
    }

    public Date getAlertTime(UUID id) {
        System.out.println("getAlerttime");
        return alertDAO.getAlert(id);
    }

    public static void main(String[] args) {
        AlertService alertService = new AlertService(new MapAlertDAO());
        alertService.raiseAlert();
        alertService.getAlertTime(UUID.randomUUID());

    }
}

class MapAlertDAO implements AlertDAO {
    private final Map<UUID, Date> alerts = new HashMap<UUID, Date>();

    @Override
    public UUID addAlert(Date time) {
        UUID id = UUID.randomUUID();
        this.alerts.put(id, time);
        return id;
    }

    @Override
    public Date getAlert(UUID id) {
        return this.alerts.get(id);
    }
}


interface AlertDAO {
    public UUID addAlert(Date time);
    public Date getAlert(UUID id);
}