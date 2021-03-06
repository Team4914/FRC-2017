package org.usfirst.frc4914.CurbStomper.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutoMiddleHook extends CommandGroup {

    public AutoMiddleHook() {
    	// strategic delay
    	// addSequential(new AutoDelay(Robot.getAutoDelay()));
    	
    	// drive forward
    	addSequential(new DeadReckon2(7.9));
    	// extend claws and deposit gear
    	addSequential(new ClawExtend2());
    	// back away from airship
    	addSequential(new DeadReckon2(-2));
    	addParallel(new ClawRetract2());
    	
    	// try two
    	addSequential(new DeadReckon2(2.1));
    	addSequential(new ClawExtend2());
    	addSequential(new DeadReckon2(-2));
    	addParallel(new ClawRetract2());
    	
    	// addSequential(new DeadReckon(3));
    	// addSequential(new ClawExtend2());
    	// addSequential(new DeadReckonBackward(2));
    	// addSequential(new ClawRetract2());
    	// turn and head down field
    	// addSequential(new TurnCCW(90));
    }
}
