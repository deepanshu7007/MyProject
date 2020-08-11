package FrontPages;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
public class FrontModel{
    static Vector<HeadMaster> headMasterList = new Vector<>();
    public static Vector<GroupMaster> groupMasterList = new Vector<>();
    public static Vector<SubGroupMaster> subGroupMasterList = new Vector<>();
    public static DefaultTableModel GroupTableModel;
    public static DefaultTableModel SubGroupTableModel;
    public FrontModel()
    {
        GroupTableModel=new DefaultTableModel(new Object[][]{},new String[]{"Name","Alias","Priority","Head"});
        SubGroupTableModel= new DefaultTableModel(new Object[][]{},new String[]{"Name","Alias","Priority","GroupName","Head"});
        HeadMaster Asserts = new HeadMaster("ASSERTS","AST");
        HeadMaster Liability = new HeadMaster("LIABILITY","LBT");
        HeadMaster Income = new HeadMaster("INCOME","ICM");
        HeadMaster Expenditure = new HeadMaster("EXPENDITURE","EXP");
        headMasterList.add(0,Asserts);
        headMasterList.add(1,Liability);
        headMasterList.add(2,Income);
        headMasterList.add(3,Expenditure);
    }
    public static class HeadMaster
    {
        String name,aliasName;
        ArrayList<GroupMaster> GroupMasterList = new ArrayList<>();
        HeadMaster(String Name,String Alias)
        {
            this.name = Name;
            this.aliasName = Alias;
        }
    }
    public static class GroupMaster
    {
        public String Name,Alias;
        public int priority;
        public HeadMaster prevLink;
        public ArrayList<SubGroupMaster> SubGroupMasterList = new ArrayList<>();
        public GroupMaster(String Name,String Alias,int priority,int prevLink)
        {
            this.Name = Name;
            this.Alias = Alias;
            this.prevLink = headMasterList.get(prevLink);
            this.priority = priority;
        }
    }
    public static class SubGroupMaster
    {
        public String Name,Alias;
        public int priority;
        public HeadMaster head;
        public GroupMaster prevLink;
        public ArrayList<SubGroupMaster> AccountMasterList = new ArrayList<>();
        public SubGroupMaster(String Name,String Alias,int priority,GroupMaster prevLink,HeadMaster head)
        {
            this.Name = Name;
            this.Alias = Alias;
            this.prevLink = prevLink;
            this.priority = priority;
            this.head=head;
        }
    }
    public static class AccountMaster
    {
    }
    public static class SupplierMaster
    {
    }
    public static class CustomerMaster
    {
    }
    
//    public DefaultTableModel getTableModel()
//    {
////        int i=0;
////        Vector gml ;
////        dtm = new DefaultTableModel();
////        while(i<FrontModel.groupMasterList.size())
////        {
////            gml = new Vector();
////            gml.add(FrontModel.groupMasterList.get(i).Name);
////            gml.add(FrontModel.groupMasterList.get(i).Alias);
////            gml.add(FrontModel.groupMasterList.get(i).prevLink);
////            gml.add(FrontModel.groupMasterList.get(i).priority);
////            dtm.addRow(gml);
////            i++;
////        }
////        return dtm;
//    }
    
    public void addGroupData(String Name,String Alias,int Priority,int Head){
        Vector v = new Vector();
        v.add(Name);
        v.add(Alias);
        v.add(Priority);
        v.add(headMasterList.get(Head).name);
        GroupMaster gm = new GroupMaster(Name, Alias, Priority, Head);
        headMasterList.get(Head).GroupMasterList.add(gm);
        groupMasterList.add(gm);
        GroupTableModel.addRow(v);
        GroupTableModel.fireTableDataChanged();
    }
    public void addSubGroupData(String Name,String Alias,int priority,String Group)
    {
        GroupMaster gm = null;
        Vector v = new Vector();
        v.add(Name);
        v.add(Alias);
        v.add(priority);
        for(GroupMaster tgm: groupMasterList)
        {
            if(tgm.Name.equals(Group))
            {
                gm=tgm;
                v.add(tgm.Name);
                v.add(tgm.prevLink.name);
                break;
            }
        }
        SubGroupMaster sgm = new SubGroupMaster(Name, Alias, priority, gm,gm.prevLink);
        gm.SubGroupMasterList.add(sgm);
        subGroupMasterList.add(sgm);
        SubGroupTableModel.addRow(v);
        SubGroupTableModel.fireTableDataChanged();
        
    }
    
//    public DefaultTableModel groupMasterTable()
//    {
//        DefaultTableModel dtm = new DefaultTableModel();
//        int i=0;
//        Vector v;
//        while(i<groupMasterList.size())
//        {
//            v= new Vector();
//            v.add(groupMasterList.get(i).Name);
//            v.add(groupMasterList.get(i).Alias);
//            v.add(groupMasterList.get(i).prevLink);
//            v.add(groupMasterList.get(i).priority);
//            dtm.addColumn(v);
//            i++;
//        }
//        return dtm;
//    }

}

//class DataNodes {
//    public static ArrayList<DataNodes.Node> NodeList = new ArrayList<DataNodes.Node>();
//    public static ArrayList<DataNodes.Child> ChildList = new ArrayList<DataNodes.Child>();
//    static class Node {
//        String Name,Alias;
//        ArrayList<Child> ChildNodeList = new ArrayList<>();             
//        Node(String Name,String Alias) {
//            this.Name=Name;
//            this.Alias=Alias;
//        }
//    }
//    static class Child{
//        String GroupName,AliasName,HeadName;
//        int Priority;
//        Node link;
//        ArrayList<SubChild> subChildList = new ArrayList<>();
//        Child(Vector v, Node link) {
//           GroupName = (String)v.get(0);
//            Priority=(Integer)v.get(1);
//            AliasName=(String)v.get(2);
//            HeadName=link.Name;
//            this.link=link;
//        }
//    }
//
//    static class SubChild {
//        String data; // Data Conatining Area of the subChild
//        Child parentChildNode;
//        SubChild(String Data,String Value) {
//            data = Data+Value;
//        }
//    }
//
//    // Adding a node at the front of the list 
//    public static Child childPush(Vector v, Node obj) {
//        Child c = new Child(v, obj);//creation of the child object with new_data{ which contains the name of the string } and obj.data {which contains the name of the parent node}
//        obj.ChildNodeList.add(c);//here we are storing the created child object to the NodeList for child objects
//        return c;
//    }
//    public static void  subChildPush(String new_data,Child obj)
//    {
//        
//        
//    }
////    public static void main(String[] args) {
////        ArrayList<Node> nodeList = new ArrayList<>();
////        ArrayList<Child> childList = new ArrayList<>();
////        ArrayList<SubChild> subChildList = new ArrayList<>();
////        DLL d = new DLL();
////        int i = 0; //used for the iteration of the list
////        while (true) {
////            Scanner s = new Scanner(System.in);
////            System.out.println("1.Wants to create a Node");
////            System.out.println("2.Wants to create a child node");
////            System.out.println("3.Wants to create a sub child node");
////            System.out.println("4.Display");
////            System.out.println("5.Exit");
////            int ch = s.nextInt();
////            switch (ch) {
////                case 1: {
////                    if (!nodeList.isEmpty()) {
////                        System.out.println("The following nodes are already existing");
////                        System.out.println("========================================");
////                        i = 0;
////                        while (i < nodeList.size()) {
////                            System.out.printf("%d .%s \n", i, nodeList.get(i).data);
////                            i++;
////                        }
////                    }
////                    System.out.println("Enter the name for the Node");
////                    String nameOfNode = s.next();
////                    Node n = new Node(nameOfNode);
////                    nodeList.add(n);
////                    System.out.printf("A Node '%s' is successfully created\n", nameOfNode);
////                    break;
////                }
////                case 2: {
////                    System.out.println("The List of nodes ");
////                    System.out.println("==================");
////                    if (nodeList.isEmpty()) {
////                        System.out.println("No Node has been created");
////                        break;
////                    } else {
////                        i = 0;
////                        while (i < nodeList.size()) {
////                            System.out.printf("%d .%s\n", i, nodeList.get(i).data);
////                            i++;
////                        }
////                        System.out.println("Select any one from the list:");
////                        int val = s.nextInt();
////                        System.out.println("Enter the name of the Child Node:");
////                        String nameOfChild = s.next();
////                        childList.add(d.childPush(nameOfChild,nodeList.get(val)));
////                    }
////                    break;
////                }
////                case 3:
////                {
////                    System.out.println("The following list of Child node is present");
////                    i=0;
////                    while(i<childList.size())
////                    {
////                        System.out.printf("%d .%s\n",i,childList.get(i).data);
////                        i++;
////                    }
////                    System.out.println("Select any one from the above:");
////                    int val=s.nextInt();
////                    System.out.print("Enter the data for sub child:");
////                    String subChildData=s.next();
////                    subChildList.add(d.subChildPush(subChildData,childList.get(val)));
////                    System.out.printf("The sub child node %s is successfully created and added",subChildData);
////                    break;
////                }
////                case 4:
////                {
////                    System.exit(1);
////                    break;
////                }
////            }
////        }
////    }
//}
//
//
////public class AccountingMaster {
//////   static 
//////    public static void main(String[] args) {
////       
////       java.awt.EventQueue.invokeLater(new Runnable() {
////            public void run() {
////                DataNodes.Node Asserts = new DataNodes.Node("ASSERT","AST");
////       DataNodes.Node Liabilities = new DataNodes.Node("LIABILITY","LBT");
////       DataNodes.Node Income = new DataNodes.Node("INCOME","ICM");
////       DataNodes.Node Expenditure = new DataNodes.Node("EXPENDITURE","EXP");
////       DataNodes.NodeList.add(Asserts);
////       DataNodes.NodeList.add(Liabilities);
////       DataNodes.NodeList.add(Income);
////       DataNodes.NodeList.add(Expenditure);
////       GeneralStore gs = new GeneralStore();
////       gs.setVisible(true);
////            }
////        });
////       
//////    }
////}
//
