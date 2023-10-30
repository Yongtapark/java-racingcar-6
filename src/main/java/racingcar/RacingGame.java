package racingcar;

import racingcar.game.Director;
import racingcar.game.Rule;
import racingcar.game.Simulator;
import racingcar.game.inputgenerateManager.InputGenerateManager;
import racingcar.game.inputgenerateManager.InputGenerateManagerImpl;
import racingcar.game.outputgeneratemanager.OutputGenerateManager;

public class RacingGame {

   private final Director director;

    private RacingGame() {
        Rule rule = new Rule();
        InputGenerateManager inputGenerateManager = new InputGenerateManagerImpl();
        OutputGenerateManager outputGenerateManager = new OutputGenerateManager(rule);
        Simulator simulator = new Simulator(inputGenerateManager);
        this.director = new Director(inputGenerateManager, outputGenerateManager, simulator);
    }

    public void start(){
        director.startProcess();
    }

    public static RacingGame createGame(){
        return new RacingGame();
    }

}
