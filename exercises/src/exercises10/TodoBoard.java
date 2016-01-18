package exercises10;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class TodoBoard {

	TodoList todoList;
	private JFrame mainFrame;
	private JTable taskTable;
	private JTextField newName;
	private JTextField newPriority;
	private JTextField newDay;
	private JTextField newMonth;
	private JButton addButton;
	private JLabel errorMsg;
	
	private final String[] columnNames = {"Name",
		"Priority",
		"Due Date"};
	
	public TodoBoard() {
		super();
		this.todoList = new TodoList();
		initFrame();
	}
	
    private void initFrame() {
	    this.mainFrame = new JFrame("My Todo List");
	    this.mainFrame.setSize(500, 700);
	    this.mainFrame.setLayout(new GridBagLayout());
	    this.mainFrame.setResizable(false);
		GridBagConstraints c = new GridBagConstraints();
		
        // Task Table
		this.taskTable = new JTable(new String[0][0], this.columnNames);
		JScrollPane scrollPane = new JScrollPane(this.taskTable);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridwidth = 3;
		c.weightx = 0;
		c.weighty = 0;
		c.gridx = 0;
		c.gridy = 0;
		this.mainFrame.getContentPane().add(scrollPane, c);
		
		// Add task button
		this.addButton = new JButton("Add New Task");
		this.addButton.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							addNewTask();
						}
				}
			);
        c.insets = new Insets(10,0,10,0); // padding top left botton right 
		c.gridwidth = 3;
		c.gridx = 0;
		c.gridy = 1;
		this.mainFrame.getContentPane().add(this.addButton, c);
		
		// Input Fields
		this.newName = new JTextField();
		this.newPriority = new JTextField();
		this.newDay = new JTextField();
        this.newMonth = new JTextField();

        this.addInputField(new JLabel("Name:"), this.newName, 2);
        this.addInputField(new JLabel("Priority:"), this.newPriority, 3);
        this.addInputField(new JLabel("Month:"), this.newMonth, 4);
		this.addInputField(new JLabel("Day:"), this.newDay, 5);
		
		// Error message label
		this.errorMsg = new JLabel("");
		this.errorMsg.setSize(50, 90);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridwidth = 3;
		c.weightx = 0;
		c.weighty = 0;
		c.gridx = 0;
		c.gridy = 6;
		this.errorMsg.setText(" ");
		this.mainFrame.getContentPane().add(this.errorMsg, c);
        
		this.mainFrame.setVisible(true);
    }
    
    private void addInputField(JLabel label, JTextField input, int row) {
    	GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(5,5,5,5); // padding top left botton right
		c.gridwidth = 1;
		c.gridx = 0;
		c.gridy = row;
		this.mainFrame.getContentPane().add(label, c);
		
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(5,5,5,5); // padding top left botton right
		c.gridwidth = 2;
		c.gridx = 1;
		c.gridy = row;
		this.mainFrame.getContentPane().add(input, c);
    }
    
    // STUDENT-TODO
    /* This method gets called whenever you press the "Add New Task" button.
     * Many exceptions can be thrown when we try to add a task from the user
     * input. These exceptions must be caught here and appropriate error
     * messages should be shown. 
     * */
    public void addNewTask() {
    	String name = this.newName.getText();
    	String priority = this.newPriority.getText();
    	String month = this.newMonth.getText();
    	String day = this.newDay.getText();
    	// Use " " rather than "" so that an empty messages take up height
    	String errorMessage = " ";
    	try {
			this.todoList.addTask(name, priority, month, day);
		} catch (NameNotUniqueException e) {
			errorMessage = "The task name \"" + name + "\" is not unique.";
		} catch (BlankNameException e) {
			errorMessage = "The task name cannot be blank.";
    	} catch (InvalidPriorityException e) {
			errorMessage = "\"" + priority + "\" is not a valid task priority.";
		} catch (InvalidMonthException e) {
			errorMessage = "\"" + month + "\" is not a valid month.";
		} catch (InvalidDayException e) {
			if (e.getMessage() != null) {
				errorMessage = "\"" + day + "\" is not a valid day in " + e.getMessage() + ".";
			} else {
				errorMessage = "\"" + day + "\" is not a valid day.";
			}
		} finally {
    		updateErrorMessage(errorMessage);
		}
    	if (errorMessage.equals(" ")) {
    		updateTaskTable();
    		clearAddTaskForm();
    	}
    }
    
    @SuppressWarnings("serial")
    private void updateTaskTable() {
    	DefaultTableModel data = new DefaultTableModel(this.todoList.toStringArray(), this.columnNames) {
    		// For now, we will make the table cells non-editable
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
    	
    	this.taskTable.setModel(data);
    }
    
    private void updateErrorMessage(String msg) {
    	this.errorMsg.setText(msg);
    }
	
    private void clearAddTaskForm() {
    	this.newName.setText("");
    	this.newPriority.setText("");
    	this.newMonth.setText("");
    	this.newDay.setText("");
    }
    
    public static void main(String[] args) {
        // Schedule a job for the event-dispatching thread:
        // creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	new TodoBoard();
            }
        });
    }
}
