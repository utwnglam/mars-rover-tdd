package com.afs.tdd;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class RoverTest {
    @Test
    public void should_locationY_add_one_given_direction_N_when_command_M() {
        MarsRover marsRover = new MarsRover(new Coordination(0, 0, 'N'));
        char command = 'M';

        marsRover.executeAction(command);
        String result = marsRover.getStatus();
        assertThat(result).isEqualTo("0 1 N");
    }

    @Test
    public void should_locationY_minus_one_given_direction_S_when_command_M() {
        MarsRover marsRover = new MarsRover(new Coordination(0, 0, 'W'));
        char command = 'M';

        marsRover.executeAction(command);
        String result = marsRover.getStatus();
        assertThat(result).isEqualTo("-1 0 W");
    }

    @Test
    public void should_locationX_add_one_given_direction_E_when_command_M() {
        MarsRover marsRover = new MarsRover(new Coordination(0, 0, 'E'));
        char command = 'M';

        marsRover.executeAction(command);
        String result = marsRover.getStatus();
        assertThat(result).isEqualTo("1 0 E");
    }

    @Test
    public void should_locationX_minus_one_given_direction_W_when_command_M() {
        MarsRover marsRover = new MarsRover(new Coordination(0, 0, 'S'));
        char command = 'M';

        marsRover.executeAction(command);
        String result = marsRover.getStatus();
        assertThat(result).isEqualTo("0 -1 S");
    }

}
