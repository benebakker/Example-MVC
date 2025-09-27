import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewController {
    private View view;
    private Accumulator myAccumulator;

    public ViewController(View view, Accumulator myAccumulator) {
        this.view = view;
        this.myAccumulator = myAccumulator;

        // Attach button listener
        this.view.getAddButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleAddButton();
            }
        });
    }

    private void handleAddButton() {
        try {
            int max = Integer.parseInt(view.getMaxValueText());
            myAccumulator.setMaxValue(max);

            int current = myAccumulator.increment();
            view.setOutputText("Counter = " + current);

        } catch (NumberFormatException ex) {
            view.setOutputText("Please enter a valid number!");
        }
    }
}