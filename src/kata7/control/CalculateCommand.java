package kata7.control;

import kata7.model.Histogram;
import kata7.view.AttributeDialog;
import kata7.view.HistogramBuilder;
import kata7.view.HistogramDisplay;
import kata7.view.PopulationDialog;


public class CalculateCommand implements Command{

    private final AttributeDialog attributeDialog;
    private final PopulationDialog populationDialog;
    private final HistogramDisplay display;

    public CalculateCommand(AttributeDialog attributeDialog, PopulationDialog pupulationDialog, HistogramDisplay display) {
        this.attributeDialog = attributeDialog;
        this.populationDialog = pupulationDialog;
        this.display = display;
    }
    
    @Override
    public void execute() {
        //Tenemos que instanciar el HistogramBuilder
        Histogram histogram = new HistogramBuilder(populationDialog.population()).build(attributeDialog.attribute());
        display.show(histogram);
    }
    
}
