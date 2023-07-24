package InMemoryModel;

import java.util.ArrayList;
import java.util.List;

import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PoligonalModel;
import ModelElements.Scene;

public class ModelStore implements iModelChanger{
    public List<PoligonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private iModelChangeObserver[] changeObservers;

    public ModelStore(iModelChangeObserver[] changeObservers) {
        this.changeObservers = changeObservers;
        this.models = new ArrayList<PoligonalModel>();
        this.scenes = new ArrayList<Scene>();
        this.flashes = new ArrayList<Flash>();
        this.cameras = new ArrayList<Camera>();

        models.add(new PoligonalModel(null));
        scenes.add(new Scene(0, models, flashes, cameras));
        flashes.add(new Flash(null, null, null, null));
        cameras.add(new Camera(null, null));
    }

    public Scene getScena(int value) {
        return new Scene(value, models, flashes, cameras);
    }

    @Override
    public void notifyChange(iModelChanger sender) {
    }
}
