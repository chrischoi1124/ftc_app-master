package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

/**
 * Created by bryce on 12/1/2017.
 */


@Autonomous(name="RedAuto2")


public class KrazyKangarooRedAuto2 extends LinearOpMode
{

        private ElapsedTime runtime = new ElapsedTime();
        DcMotor backLeftWheel = null;
        DcMotor backRightWheel = null;

        @Override
        public void runOpMode() throws InterruptedException {
            telemetry.addData("Status", "Initialized2");
            telemetry.update();

            //backLeftWheel = hardwareMap.dcMotor.get("motorLeftWheel");
            //backRightWheel = hardwareMap.dcMotor.get("motorRightWheel");
            backLeftWheel = hardwareMap.dcMotor.get("backLeftWheel");
            backRightWheel = hardwareMap.dcMotor.get("backRightWheel");



            backRightWheel.setDirection(DcMotor.Direction.REVERSE);


            waitForStart();
            runtime.reset();

            DriveForward(1);
            Thread.sleep(1000);
            TurnLeft(1);
            Thread.sleep(1000);
            DriveForward(1);
            Thread.sleep(1000);


            telemetry.addData("Status", "Run Time: " + runtime.toString());
            telemetry.addData("Motors", "left (%.2f), right (%.2f)", 123.0, 321.0);
            telemetry.update();

        }
            public void DriveForward(double power) {
    backLeftWheel.setPower(power);
    backRightWheel.setPower(power);

}
            public void TurnLeft(double power){
            backLeftWheel.setPower(-power);
            backRightWheel.setPower(power);

         }
            public void TurnRight(double power){
            backLeftWheel.setPower(power);
            backRightWheel.setPower(-power);
         }




}
