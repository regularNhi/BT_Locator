package BaiTapLocator;

public class LocatorCRM {

    //Login Page
    public static String h1Login = "//h1[normalize-space()='Login']";
    public static String inputEmail = "//input[@id='email']";
    public static String inputPassword = "//input[@id='password']";
    public static String checkboxRememberMe = "//input[@id='remember']";
    public static String buttonLogin = "//button[normalize-space()='Login']";
    public static String linkForgotPassword = "//a[normalize-space()='Forgot Password?']";
    public static String textAlertError = "//div[@id='alerts']/div";

    //Customer Menu - cách 1-5
    public static String buttonNewCustomer = "//a[normalize-space()='New Customer']";
    public static String buttonImportCustomer = "//a[normalize-space()='Import Customers']";
    public static String buttonContacts = "//a[normalize-space()='Contacts']";
    public static String buttonFilterClients = "//button[@class='btn btn-default dropdown-toggle sm:tw-max-w-xs tw-truncate']";

    public static String textTotalCustomers = "//span[normalize-space()='Total Customers']";
    public static String textTotalActiveCustomers = "//span[normalize-space()='Active Customers']";
    public static String textTotalInactiveCustomers = "//span[normalize-space()='Inactive Customers']";
    public static String textTotalActiveContacts = "//span[normalize-space()='Active Contacts']";
    public static String textTotalInactiveContacts = "//span[normalize-space()='Inactive Contacts']";
    public static String textTotalContactsLoggedInToday = "//span[normalize-space()='Contacts Logged In Today']";


    public static String selectClientsLength = "//select[@name='clients_length']";
    public static String buttonExportClients = "//button[@class='btn btn-default buttons-collection btn-sm btn-default-dt-options' and @type ='button']";
    public static String buttonBulkAction = "//button[@class='btn btn-default btn-sm btn-default-dt-options']";
    public static String buttonReload = "//button[@class='btn btn-default btn-sm btn-default-dt-options btn-dt-reload']";
    public static String checkboxSelectAll = "//input[@id='mass_select_all']";
    public static String numberSorting = "//th[@id='th-number']";
    public static String companySorting = "//th[@id='th-company']";
    public static String primaryContactSorting = "//h1[normalize-space()='Login']";
    public static String primaryEmailSorting = "//th[@id='th-primary-contact-email']";
    public static String phoneSorting = "//th[@id='th-phone']";
    public static String activeSorting = "//th[@id='th-active']";
    public static String groupsSorting = "//th[@id='th-groups']";
    public static String dateCreatedSorting = "//th[@id='th-date-created']";

    public static String linkCompanyDetails = "//a[normalize-space()='Person - View Profile']";
    public static String linkPrimaryContact= "//a[normalize-space()='eeeeee eeeeee']";
    public static String linkPrimaryEmail= "//a[contains(@href,'mailto:eeeeee']";
    public static String linkPhone= "//a[contains(@href,'tel:ABC')]";
    public static String switchActiveOnOff= "//label[@class='onoffswitch-label']";
    public static String statusGroups= "//tr[@class='has-row-options odd']//span[@class='label label-default mleft5 customer-group-list pointer']";

    public static String clientsDataInfo= "//div[@id='clients_info']";
    public static String clientsPagination= "//div[@id='clients_paginate']";
    public static String clientsPaginationPrevious= "//a[normalize-space()='Previous']";
    public static String selectClientsPage= "//select[@id='dt-page-jump-clients']";

    //Form New Customer
    public static String tabCustomerDetails = "//a[normalize-space()='Customer Details']";

    public static String inputCompany = "//input[@id='company']";

    public static String inputVATNumber = "//input[@id='vat']";

    public static String inputPhoneNumber = "//input[@id='phonenumber']";

    public static String inputWebsite = "//input[@id='website']";

    public static String buttonDropdownGroups = "//span[normalize-space()='Inactive Customers']";
    public static String buttonAddNewGroup = "//a[@data-target='#customer_group_modal']";
    public static String inputGroups = "//div[@class='dropdown bootstrap-select show-tick input-group-btn _select_input_group bs3 dropup open']//input[@aria-label='Search']";
    public static String buttonSelectAllGroups = "//button[normalize-space()='Select All']";
    public static String buttonDeselectAllGroups = "//button[normalize-space()='Deselect All']";

    public static String selectCurrency= "//div[@class='dropdown bootstrap-select bs3']//button[@title='System Default']";
    public static String selectDefaultLanguage = "//button[@class='btn dropdown-toggle btn-default']";

    public static String inputAddress = "//textarea[@id='address']";

    public static String inputCity = "//input[@id='city']";
    public static String inputState = "//input[@id='state']";
    public static String inputZip = "//input[@id='zip']";

    public static String selectCountry = "//div[@app-field-wrapper='country']//button[@title='Nothing selected']";
    public static String searchCountryName = "//div[@class='dropdown bootstrap-select bs3 open']//input[@aria-label='Search']";

    public static String buttonSaveAndCreateContact = "//button[normalize-space()='Save and create contact']";
    public static String buttonSave = "//button[@class='btn btn-primary only-save customer-form-submiter']";



    //Project 6-10
    public static String buttonNewProject = "//a[@href='https://crm.anhtester.com/admin/projects/gantt']/preceding-sibling::a";
    public static String buttonGanttPage = "//a[normalize-space()='New Project']/following-sibling::a";
    public static String buttonFilterProjects = "//div[@class='tw-inline pull-right']/descendant::button";

    public static String totalNotStartedProjects = "//span[@class='project-status-#475569' and normalize-space()='Not Started']/preceding-sibling::span";
    public static String totalInProgressProjects = "//span[@class='project-status-#2563eb' and normalize-space()='In Progress']/preceding-sibling::span";
    public static String totalOnHoldProjects = "//span[@class='project-status-#f97316' and normalize-space()='OnHold']/preceding-sibling::span";
    public static String totalCancelProjects = "//span[@class='project-status-#94a3b8']/preceding-sibling::span";
    public static String totalFinishedProjects = "//span[@class='project-status-#16a34a']/preceding-sibling::span";

    public static String selectProjectLength = "//div[@id='projects_length']/descendant::select";
    public static String buttonExportProject = "//span[normalize-space()='Export']/parent::button";
    public static String buttonReloadProjects = "(//span[normalize-space()='Export']/parent::button)/following-sibling::button";

    public static String tableProjectIndexSorting = "//table[@id='projects']/descendant::th[normalize-space()='#']";
    public static String tableProjectNameSorting = "//table[@id='projects']/descendant::th[normalize-space()='Project Name']";
    public static String tableProjectCustomerSorting = "//table[@id='projects']/descendant::th[normalize-space()='Customer']";
    public static String tableProjectTagsSorting = "//table[@id='projects']/descendant::th[normalize-space()='Tags']";
    public static String tableProjectStartDateSorting = "//table[@id='projects']/descendant::th[normalize-space()='Start Date']";
    public static String tableProjectDeadlineSorting = "//table[@id='projects']/descendant::th[normalize-space()='Deadline']";
    public static String tableProjectMembersSorting = "//table[@id='projects']/descendant::th[normalize-space()='Members']";
    public static String tableProjectStatusSorting = "//table[@id='projects']/descendant::th[normalize-space()='Status']";

    //Form New Project
    public static String h4AddNewProject = "//h4[normalize-space()='Add new project']";
    public static String linkTabProject = "//div[@class='horizontal-tabs']/descendant::a[normalize-space()='Project']";

    public static String labelProjectName = "//input[@id='name']/preceding-sibling::label";
    public static String inputProjectName = "//div[@app-field-wrapper='name']/input";

    public static String selectCustomerName = "//label[@for='clientid']/following-sibling::div";
    public static String inputSearchCustomerName = "//div[@class='dropdown bootstrap-select ajax-search bs3 open']/descendant::input";

    public static String checkboxCalculateProgress = "//label[normalize-space()='Calculate progress through tasks']/preceding-sibling::input";
    public static String labelCalculateProgress = "//input[@id='progress_from_tasks']/following-sibling::label";

    public static String labelProgress = "//span[@class='label_progress']/parent::label";
    public static String numberProgress = "//span[@class='label_progress']";
    public static String barProgress = "//div[contains(@class,'project_progress_slider project_progress_slider')]";


    public static String buttonDropdownBillingTypes = "//div[@class='dropdown bootstrap-select bs3 dropup']/child::button[@title='Project Hours']";
    public static String buttonDropdownStatus = "//div[@class='dropdown bootstrap-select bs3 dropup']/child::button[@title='In Progress']";

    public static String inputRatePerHour= "//label[normalize-space()='Rate Per Hour']/following-sibling::input";
    public static String inputEstimateHour = "//label[normalize-space()='Estimated Hours']/following-sibling::input";

    public static String buttonDropdownMembers = "//div[@app-field-wrapper='project_members[]']/descendant::button[@title='Admin Example']";
    public static String inputSearchMembers = "//div[@app-field-wrapper='project_members[]']/descendant::input";
    public static String buttonSelectAllMembers = "//div[@app-field-wrapper='project_members[]']/descendant::button[normalize-space()='Select All']";
    public static String buttonDeselectAllMembers = "//div[@app-field-wrapper='project_members[]']/descendant::button[normalize-space()='Deselect All']";
    public static String inputStartDate = "//div[@app-field-wrapper='start_date']//div[@class='input-group date']/child::input";
    public static String inputDeadlineDate = "//div[@app-field-wrapper='deadline']/descendant::input";

    public static String inputTags = "//label[normalize-space()='Tags']/following-sibling::ul/descendant::input";

        //Mục Description
    public static String pDescription = "//div[@app-field-wrapper='description']/preceding-sibling::p";
    public static String buttonFile = "//span[normalize-space()='File']/parent::button";
    public static String buttonEdit = "//span[normalize-space()='Edit']/parent::button";
    public static String buttonView = "//span[normalize-space()='View']/parent::button";
    public static String buttonInsert = "//span[normalize-space()='Insert']/parent::button";
    public static String buttonFormat = "//span[normalize-space()='Format']/parent::button";
    public static String buttonTools = "//span[normalize-space()='Tools']/parent::button";
    public static String buttonTable = "//span[normalize-space()='Table']/parent::button";

    public static String selectSystemFont = "//div[@class='tox-toolbar__primary']/descendant::button[contains(@title,'System Font')]";
    public static String selectFontSize = "//div[@class='tox-toolbar__primary']/descendant::button[contains(@title,'Font size')]";
    public static String selectTextColorBlack ="//div[contains(@title,'Text color')]//span[@class='tox-icon tox-tbtn__icon-wrap']/parent::span";
    public static String selectTextColor = "//div[@title='Text color Black']/child::span[2]";
    public static String selectBackgroundColorBlack = "//div[@title='Background color Black']/child::span[@class = 'tox-tbtn']";
    public static String selectBackgroundColor = "//div[@title='Background color Black']/child::span[contains(@class,'chevron')]";
    public static String buttonBoldText = "(//div[@role='toolbar'])[3]/button[contains(@title,'Bold')]";
    public static String buttonItalicText = "(//div[@role='toolbar'])[3]/button[contains(@title,'Italic')]";
    public static String buttonMoreFormat = "(//div[@role='toolbar'])[4]/button";

    public static String textareaDescription = "//div[@class='tox-edit-area']/iframe";
        //kết thúc mục Description

    public static String checkboxSendProjectCreatedEmail = "//label[normalize-space()='Send project created email']/preceding-sibling::input";

    public static String buttonSaveProject = "//div[@class='panel-footer text-right']/button";

}
