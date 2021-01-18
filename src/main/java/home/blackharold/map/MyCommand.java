package home.blackharold.map;

import java.util.LinkedList;
import java.util.Queue;

public class MyCommand {

	public static void main(String[] args) {

		Queue<Command> comm = new LinkedList<>();

		String name;

		for (int i = 0; i < 100000; i++) {
			name = "Command" + i;
			comm.add(new Command(name));
		}

		for (Command command : comm) {
			System.out.println(command.operation() + " ");
		}
	}
}

class Command {

	String string;

	public Command(String string) {
		this.string = string;
	}

	String operation() {
		return string;
	}
}
