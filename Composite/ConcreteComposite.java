package Composite;

import java.util.ArrayList;

public class ConcreteComposite implements IComponent {

   public ArrayList<IComponent> components;

     public ConcreteComposite(){
      components = new ArrayList<>();
   }

   public void addComponent(IComponent component) {
      this.components.add(component);
   }

 
   @Override
   public void method() {

      System.out.println("In concrete");
      for (IComponent component : components) {
         component.method();    
      }
   }
   
}
