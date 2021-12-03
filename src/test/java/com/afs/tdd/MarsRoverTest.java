package com.afs.tdd;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MarsRoverTest {
    @Test
    public void should_locationY_add_one_given_direction_N_when_command_M() {
        MarsRover marsRover = new MarsRover(new Position(0, 0, 'N'));
        String command = "M";

        marsRover.executeActions(command);
        String result = marsRover.getStatus();
        assertThat(result).isEqualTo("0 1 N");
    }

    @Test
    public void should_locationX_minus_one_given_direction_W_when_command_M() {
        MarsRover marsRover = new MarsRover(new Position(0, 0, 'W'));
        String command = "M";

        marsRover.executeActions(command);
        String result = marsRover.getStatus();
        assertThat(result).isEqualTo("-1 0 W");
    }

    @Test
    public void should_locationX_add_one_given_direction_E_when_command_M() {
        MarsRover marsRover = new MarsRover(new Position(0, 0, 'E'));
        String command = "M";

        marsRover.executeActions(command);
        String result = marsRover.getStatus();
        assertThat(result).isEqualTo("1 0 E");
    }

    @Test
    public void should_locationY_minus_one_given_direction_S_when_command_M() {
        MarsRover marsRover = new MarsRover(new Position(0, 0, 'S'));
        String command = "M";

        marsRover.executeActions(command);
        String result = marsRover.getStatus();
        assertThat(result).isEqualTo("0 -1 S");
    }

    @Test
    public void should_direction_to_W_given_direction_N_when_command_L() {
        MarsRover marsRover = new MarsRover(new Position(0, 0, 'N'));
        String command = "L";

        marsRover.executeActions(command);
        String result = marsRover.getStatus();
        assertThat(result).isEqualTo("0 0 W");
    }

    @Test
    public void should_direction_to_S_given_direction_W_when_command_L() {
        MarsRover marsRover = new MarsRover(new Position(0, 0, 'W'));
        String command = "L";

        marsRover.executeActions(command);
        String result = marsRover.getStatus();
        assertThat(result).isEqualTo("0 0 S");
    }

    @Test
    public void should_direction_to_E_given_direction_S_when_command_L() {
        MarsRover marsRover = new MarsRover(new Position(0, 0, 'S'));
        String command = "L";

        marsRover.executeActions(command);
        String result = marsRover.getStatus();
        assertThat(result).isEqualTo("0 0 E");
    }

    @Test
    public void should_direction_to_N_given_direction_E_when_command_L() {
        MarsRover marsRover = new MarsRover(new Position(0, 0, 'E'));
        String command = "L";

        marsRover.executeActions(command);
        String result = marsRover.getStatus();
        assertThat(result).isEqualTo("0 0 N");
    }

    @Test
    public void should_direction_to_W_given_direction_N_when_command_R() {
        MarsRover marsRover = new MarsRover(new Position(0, 0, 'N'));
        String command = "R";

        marsRover.executeActions(command);
        String result = marsRover.getStatus();
        assertThat(result).isEqualTo("0 0 E");
    }

    @Test
    public void should_direction_to_S_given_direction_W_when_command_R() {
        MarsRover marsRover = new MarsRover(new Position(0, 0, 'W'));
        String command = "R";

        marsRover.executeActions(command);
        String result = marsRover.getStatus();
        assertThat(result).isEqualTo("0 0 N");
    }

    @Test
    public void should_direction_to_E_given_direction_S_when_command_R() {
        MarsRover marsRover = new MarsRover(new Position(0, 0, 'S'));
        String command = "R";

        marsRover.executeActions(command);
        String result = marsRover.getStatus();
        assertThat(result).isEqualTo("0 0 W");
    }

    @Test
    public void should_direction_to_N_given_direction_E_when_command_R() {
        MarsRover marsRover = new MarsRover(new Position(0, 0, 'E'));
        String command = "R";

        marsRover.executeActions(command);
        String result = marsRover.getStatus();
        assertThat(result).isEqualTo("0 0 S");
    }

    @Test
    public void should_return_correct_position_given_multi_command_when_command_MLMR() {
        MarsRover marsRover = new MarsRover(new Position(0, 0, 'N'));
        String command = "MLMR";

        marsRover.executeActions(command);
        String result = marsRover.getStatus();
        assertThat(result).isEqualTo("-1 1 N");
    }
}
