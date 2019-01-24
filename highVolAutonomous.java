
package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.Servo;

@Autonomous(name="highVolAutonomous", group="Iterative Opmode")
public class highVolAutonomous extends OpMode {
    DcMotor MotorL;
    DcMotor MotorR;
    DcMotor wench;
    ColorSensor colSens;
    servo hook;



     // Code to run ONCE when the driver hits INIT

    public void init() {
        //init hardwear
        MotorL = hardwareMap.dcMotor.get("mL");
        MotorR = hardwareMap.dcMotor.get("mR");
        wench = hardwareMap.dcMotor.get("wench");
        colSens = hardwareMap.colorSensor.get("colSens");
        hook =  harfwearMap.srvo.set(servo.class, "hookServo");

        //enable light on
        colSens.enableLed(true);

        //set encoders for yor motors
        //MotorL
        MotorL.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        MotorL.setMode(DcMotor.RunMode.RUN_USING_ENCODERS);
        //MotorR
        MotorR.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        MotorL.setMode(DcMotor.RunMode.RUN_USING_ENCODERS);
        //Wench
        wench.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        wench.setMode(DcMotor.RunMode.RUN_USING_ENCODERS);



        //init telemitry
        telemetry.addData("status", "initialized");

    }

    public void init_loop() {


    }

    public void start(){
        //pulse positions
        int wenchRaiseOne = 2085;



    }






    }

    public void loop() {
    //is the bot lowered
        if (wenchRaiseOne >= 2080){
            isLowered = true;
        }else{
            isLowered = false;
        }

        if(isLowered == false){
            wench.setTargetPosition(wenchRaiseOne);
            wench.setPower(-1);
            wench.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            wench.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        }
}


