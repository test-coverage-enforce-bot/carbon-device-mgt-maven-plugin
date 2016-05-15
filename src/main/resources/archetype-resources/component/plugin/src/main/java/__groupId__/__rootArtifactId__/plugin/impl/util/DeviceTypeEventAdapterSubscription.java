package ${groupId}.${rootArtifactId}.plugin.impl.util;

import org.wso2.carbon.event.input.adapter.core.InputEventAdapterSubscription;

public class DeviceTypeEventAdapterSubscription implements InputEventAdapterSubscription {

    @Override
    public void onEvent(Object o) {
        String msg = (String) o;
        if (msg != null && !msg.isEmpty()) {
            String[] messages = (msg).split(",");
            String deviceId = messages[0];
            String actualMessage = messages[1];
            if (actualMessage.contains("PUBLISHER")) {
                float sensorValue = Float.parseFloat(actualMessage.split(":")[2]);
                DeviceTypeUtils.publishToDAS(deviceId, sensorValue);
            }
        }
    }
}
