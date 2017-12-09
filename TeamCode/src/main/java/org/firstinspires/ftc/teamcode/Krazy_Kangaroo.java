package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by chris on 12/9/2017.
 */

public class Krazy_Kangaroo extends OpMode{

    private DcMotor leftMotor = null;
    private DcMotor rightMotor = null;

    @Override
    public void init() {
        telemetry.addData("Status", "Initialized");


        leftMotor  = hardwareMap.get(DcMotor.class, "backLeftWheel");
        rightMotor = hardwareMap.get(DcMotor.class, "backRightWheel");
    }

    @Override
    public void loop() {




    }
}
