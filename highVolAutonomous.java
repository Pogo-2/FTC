package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.ColorSensor;

@Autonomous(name="highVolAutonomous", group="Iterative Opmode")
public class highVolAutonomous extends OpMode {
    DcMotor MotorL;
    DcMotor MotorR;
    DcMotor wench;
    ColorSensor colSens;



    /*
     * Code to run ONCE when the driver hits INIT
     */
    public void init() {
        MotorL = hardwareMap.dcMotor.get("mL");
        MotorR = hardwareMap.dcMotor.get("mR");
        wench = hardwareMap.dcMotor.get("wench");
        colSens = hardwareMap.colorSensor.get("colSens");
        colSens.enableLed(true);
        //testing
        telemetry.addData("status", "initialized");

    }

    public void init_loop() {


    }

    public void loop() {
        telemetry.addData("Red  ", colSens.red());
        telemetry.addData("Green ", colSens.green());
        telemetry.addData("Blue ", colSens.blue());
    }
}

