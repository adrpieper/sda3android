package examples.sda.accel;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Medard on 2017-04-28.
 */

 public class Accelerometer implements SensorEventListener, InterfaceAccelerometer {

    private float val_x;
    private float val_y;
    private float val_z;

    public float getVal_x() {
        return val_x;
    }
    public float getVal_y() {
        return val_y;
    }
    public float getVal_z() {
        return val_z;
    }

    private SensorManager sensorManager;
    private Sensor accelerometer;

    public Accelerometer(SensorManager sensorManager) {
        this.sensorManager = sensorManager;
    }

    public void onCreate() {

        // sprawdzam czy usługa posiada sensor - accelerometer
        if (sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER) != null) {

            // jeśli posiadamy sensor, przypisujemy go do zmiennej
            accelerometer = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
            sensorManager.registerListener(this, accelerometer, SensorManager.SENSOR_DELAY_NORMAL);
        }
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == Sensor.TYPE_ACCELEROMETER) {

            val_x = sensorEvent.values[0];

            val_y = sensorEvent.values[1];

            val_z = sensorEvent.values[2];
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
}
