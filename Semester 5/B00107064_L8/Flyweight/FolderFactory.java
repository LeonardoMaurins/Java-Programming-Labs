import java.awt.*;

// Returns either selected or unselected folder object but
// doesn't create additional instances once each has been created
class FolderFactory {
	private Folder unSelected, Selected;

	public FolderFactory() {
		// Color brown = new Color(0x5f5f1c);
		Selected = new Folder(new Color(0x5f5f1c));
		unSelected = new Folder(Color.yellow);
	}

	// Constructor of type Folder taking in one variable
	public Folder getFolder(boolean isSelected) {
		if (isSelected)
			return Selected;
		else
			return unSelected;
	}
}
