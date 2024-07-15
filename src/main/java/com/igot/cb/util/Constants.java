package com.igot.cb.util;

/**
 * @author Mahesh RV
 */
public class Constants {

    public static final String KEYSPACE_SUNBIRD = "sunbird";
    public static final String KEYSPACE_SUNBIRD_COURSES = "sunbird_courses";
    public static final String CORE_CONNECTIONS_PER_HOST_FOR_LOCAL = "coreConnectionsPerHostForLocal";
    public static final String CORE_CONNECTIONS_PER_HOST_FOR_REMOTE = "coreConnectionsPerHostForRemote";
    public static final String MAX_CONNECTIONS_PER_HOST_FOR_LOCAL = "maxConnectionsPerHostForLocal";
    public static final String MAX_CONNECTIONS_PER_HOST_FOR_REMOTE = "maxConnectionsPerHostForRemote";
    public static final String MAX_REQUEST_PER_CONNECTION = "maxRequestsPerConnection";
    public static final String HEARTBEAT_INTERVAL = "heartbeatIntervalSeconds";
    public static final String POOL_TIMEOUT = "poolTimeoutMillis";
    public static final String CASSANDRA_CONFIG_HOST = "cassandra.config.host";
    public static final String SUNBIRD_CASSANDRA_CONSISTENCY_LEVEL = "LOCAL_QUORUM";
    public static final String EXCEPTION_MSG_FETCH = "Exception occurred while fetching record from ";
    public static final String INSERT_INTO = "INSERT INTO ";
    public static final String DOT = ".";
    public static final String OPEN_BRACE = "(";
    public static final String VALUES_WITH_BRACE = ") VALUES (";
    public static final String QUE_MARK = "?";
    public static final String COMMA = ",";
    public static final String CLOSING_BRACE = ");";
    public static final String INTEREST_ID = "interest_id";
    public static final String RESPONSE = "response";
    public static final String SUCCESS = "success";
    public static final String FAILED = "Failed";
    public static final String ERROR_MESSAGE = "errmsg";
    public static final String DEMAND_ID = "demand_id";
    public static final String DEMAND_ID_RQST = "demandId";
    public static final String USER_ID = "user_id";
    public static final String USER_ID_RQST = "userId";
    public static final String INTEREST_FLAG = "interest_flag";
    public static final String INTEREST_FLAG_RQST = "interestFlag";
    public static final String CREATED_ON = "createdOn";
    public static final String UPDATED_ON = "updatedOn";
    public static final String DATA = "data";
    public static final String DATABASE = "sunbird";
    public static final String TABLE = "interest_capture";
    public static final String REGEX = "^\"|\"$";
    public static final String IS_ACTIVE = "isActive";
    public static final Boolean ACTIVE_STATUS = true;
    public static final String LAST_UPDATED_DATE = "lastUpdatedDate";
    public static final String CREATED_DATE = "createdDate";
    public static final String PAYLOAD_VALIDATION_FILE = "/payloadValidation/demandValidationData.json";
    public static final String INDEX_NAME = "demand_entity";
    public static final String INDEX_TYPE = "_doc";
    public static final String RESULT = "result";
    public static final String FAILED_CONST = "FAILED";
    public static final String ERROR = "ERROR";
    public static final String REDIS_KEY_PREFIX = "cbextenroll_";
    public static final String KEYWORD = ".keyword";
    public static final String ASC = "asc";
    public static final String REQUEST_PAYLOAD = "requestPayload";
    public static final String JWT_SECRET_KEY = "demand_search_result";
    public static final String PAYLOAD_VALIDATION_FILE_CONTENT_PROVIDER = "/payloadValidation/contentProviderValidation.json";
    public static final String CONTENT_PROVIDER_ID = "id";
    public static final String INTEREST_COUNT = "interestCount";
    public static final String INTERESTS = "demand_search_result";
    public static final String DOT_SEPARATOR = ".";
    public static final String SHA_256_WITH_RSA = "SHA256withRSA";
    public static final String UNAUTHORIZED = "Unauthorized";
    public static final String SUB = "sub";
    public static final String SSO_URL = "sso.url";
    public static final String SSO_REALM = "sso.realm";
    public static final String ACCESS_TOKEN_PUBLICKEY_BASEPATH = "accesstoken.publickey.basepath";
    public static final String NO_DATA_FOUND = "No data found";
    public static final String SUCCESSFULLY_CREATED = "successfully created";
    public static final String ID = "id";
    public static final String SUCCESSFULLY_READING = "successfully read";
    public static final String ID_NOT_FOUND = "Id not found";
    public static final String INVALID_ID = "Invalid Id";
    public static final String DELETED_SUCCESSFULLY = "deleted successfully";
    public static final String ALREADY_INACTIVE = "already inactive Id";
    public static final String ERROR_WHILE_DELETING_DEMAND = "Error while deleting demand with ID";
    public static final String SUCCESSFULLY_UPDATED = "successfully updated";
    public static final String CONTENT_PARTNER_NOT_FOUND = "content partner not found";
    public static final String FETCH_RESULT_CONSTANT = ".fetchResult:";
    public static final String URI_CONSTANT = "URI: ";
    public static final String OK = "OK";
    public static final String RESPONSE_CODE = "responseCode";
    public static final String CONTENT = "content";
    public static final String LIVE = "Live";
    public static final String STATUS = "status";
    public static final String NAME = "name";
    public static final String COMPETENCIES_V5 = "competencies_v5";
    public static final String AVG_RATING = "avgRating";
    public static final String ORG_ID = "orgId";
    public static final String CHILDREN = "children";
    public static final String API_VERSION_1 = "1.0";
    public static final String API_PLAYLIST_CREATE = "api.playlist.create";
    public static final String API_PLAYLIST_READ = "api.playlist.read";
    public static final Object CREATED = "Created";
    public static final String IDENTIFIER = "identifier";
    public static final String DESCRIPTION = "description";
    public static final String ADDITIONAL_TAGS = "additionalTags";
    public static final String CONTENT_TYPE_KEY = "contentType";
    public static final String PRIMARY_CATEGORY = "primaryCategory";
    public static final String DURATION = "duration";
    public static final String COURSE_APP_ICON = "appIcon";
    public static final String POSTER_IMAGE = "posterImage";
    public static final String ORGANISATION = "organisation";
    public static final String CREATOR_LOGO = "creatorLogo";
    public static final String NOT_FOUND = "Not found";
    public static final String FILTERS = "filters";
    public static final String REQUEST_TYPE = "requestType";
    public static final String RQST_CONTENT_TYPE = "type";
    public static final String PLAY_LIST_VALIDATION_FILE_JSON = "/payloadValidation/playListValidationFile.json";
    public static final String ORG_FEATURED_COURSE_KEY = "ORG_FEATURED_COURSES";
    public static final String ORG_COURSE_NOT_FOUND = "Not found course for this org";
    public static final String API_PLAYLIST_UPDATED = "api.playlist.updated";
    public static final Object UPDATED = "Updated";
    public static final String INTEREST_VALIDATION_FILE_JSON = "/payloadValidation/interestPayloadValidation.json";
    public static final String REQUESTED = "Requested";
    public static final String INTEREST_INDEX_NAME = "interests";
    public static final String INTEREST_ID_RQST = "interestId";
    public static final String ASSIGNED_PROVIDER = "assignedProvider";
    public static final String ASSIGNED_BY = "assignedBy";
    public static final String GRANTED = "Granted";
    public static final String ASSIGNED = "Assigned";
    public static final String SUCCESSFULLY_ASSIGNED = "Successfully Assigned interest with demand";
    public static final String OWNERID = "ownerId";
    public static final String X_AUTH_USER_ORG_ID = "x-authenticated-user-orgid";
    public static final String X_AUTH_TOKEN = "x-authenticated-user-token";
    public static final String USER_ID_DOESNT_EXIST = "User Id doesn't exist! Please supply a valid auth token";
    public static final String TABLE_USER = "user";
    public static final String ROOT_ORG_ID = "rootOrgId";
    public static final String USER_ROOT_ORG_ID = "rootorgid";
    public static final String ROOT_ORG_ID_DOESNT_MATCH = "Unauthorized User.";
    public static final String OWNER = "owner";
    public static final String STATUS_TRANSITION_PATH = "/payloadValidation/statusTransitions.json";
    public static final String BROADCAST = "Broadcast";
    public static final String UNASSIGNED = "Unassigned";
    public static final String INVALID_STATUS_TRANSITION = "Requesting with invalid status";
    public static final String NEW_STATUS = "newStatus";
    public static final String MISSING_ID_OR_NEW_STATUS = "demand id and newStatus are required for updating demand";
    public static final String CANNOT_UPDATE_INACTIVE_DEMAND = "Cannot update inactive demand";
    public static final String USER_ROOT_ORG_NAME = "orgname";
    public static final String ORG_TABLE = "organisation";
    public static final String ORG_NAME = "orgName";
    public static final String PROVIDER_ID = "providerId";
    public static final String PROVIDER_NAME = "providerName";
    public static final String PREV_ASSIGNED_PROVIDER = "previousAssignedProvider";
    public static final String ANNOUNCEMENT_VALIDATION_FILE_JSON = "/payloadValidation/announcementValidation.json";
    public static final String ANNOUNCEMENT_ID = "announcementId";
    public static final String ANNOUNCEMENT_INDEX = "announcement_entity";
    public static final String PLAYLIST_INDEX_NAME = "playlist";
    public static final String KEY_PLAYLIST = "playListKey";
    public static final String ACTIVE = "Active";
    public static final String IN_ACTIVE = "Inactive";
    public static final String ORG_BOOKMARK_ID = "orgBookmarkId";
    public static final String PAYLOAD_VALIDATION_FILE_ORG_BOOKMARK_LIST = "/payloadValidation/orgBookmarkValidation.json";
    public static final String ERROR_WHILE_DELETING_ORG_LIST = "Error while deleting orgBookmark with ID";
    public static final String INDEX_NAME_FOR_ORG_BOOKMARK = "orgbookmark";
    public static final String REQUEST_CONSTANT = "Request: ";
    public static final String RESPONSE_CONSTANT = "Response: ";
    public static final String REQUEST = "request";
    public static final String AUTHORIZATION = "authorization";
    public static final String CREATED_BY = "createdBy";
    public static final String ORG_LIST = "orgList";
    public static final String PAYLOAD_VALIDATION_UPDATE_FILE_ORG_BOOKMARK_LIST = "/payloadValidation/orgBookmarkUpdateValidation.json";
    public static final String API_ORG_BOOKMARK_CREATE = "api.org.bookmark.create";
    public static final String API_ORG_BOOKMARK_UPDATE = "api.org.bookmark.update";
    public static final String API_ORG_BOOKMARK_READ = "api.org.bookmark.read";
    public static final String API_ORG_BOOKMARK_DELETE = "api.org.bookmark.delete";
    public static final String REDIS_ORG_BOOKMARK_KEY = "ORG_BOOKMARK";
    public static final String UNDER_SCORE = "_";
    public static final String CATEGORY = "category";
    public static final String BOOKMARK_ALREADY_AVAILABLE = "Bookmark already available for the orgId: {0} and category: {1}, please update the bookmark.";
    public static final String TOTAL_COUNT = "totalCount";
    public static final String TABLE_EMAIL_TEMPLATE ="email_template";
    public static final String TEMPLATE = "template";
    public static final String EMAIL = "email";
    public static final String MDO_NAME="mdoName";
    public static final String EMAIL_ID_LIST = "emailIdList";
    public static final String COMPETENCY_AREA = "competency area";
    public static final String COMPETENCY_AREA_PARAM = "competency_area";
    public static final String COMPETENCY_THEME_PARAM = "competency_theme";
    public static final String COMPETENCY_SUB_THEME_PARAM = "competency_subtheme";
    public static final String REQUEST_CONTENT_SUBJECT = "Request to create content #demandId .";
    public static final String COMPETENCY_THEMES = "competencyThemes";
    public static final String COMPETENCY_SUB_THEMES = "competencySubThemes";
    public static final String FIELDS = "fields";
    public static final String FIELDS_CONSTANT = "fields";
    public static final String PROFILE_DETAILS = "profileDetails";
    public static final String PRIMARY_EMAIL = "primaryEmail";
    public static final String PERSONAL_DETAILS = "personalDetails";
    public static final String ORGANIZATIONS_ROLES = "organisations.roles";
    public static final String CBP_ADMIN = "CBP_Admin";
    public static final String MDO_NAME_PARAM = "mdo_name";
    public static final String FROM_EMAIL = "fromEmail";
    public static final String CONFIG = "config";
    public static final String TYPE = "type";
    public static final String PARAMS = "params";
    public static final String MDO = "mdo";
    public static final String NOTIFICATIONS = "notifications";
    public static final String COMPETENCIES ="competencies";
    public static final String CONTENT_TYPE = "Content-Type";
    public static final String APPLICATION_JSON = "application/json";
    public static final String PROFILE_DETAILS_PRIMARY_EMAIL = "profileDetails.personalDetails.primaryEmail";
    public static final String TITLE = "title";
    public static final String OBJECTIVE = "objective";
    public static final String FIRST_NAME = "firstname";
    public static final String AREA = "area";
    public static final String THEME = "theme";
    public static final String SUB_THEME = "sub_theme";
    public static final String PREFERRED_PROVIDER = "preferredProvider";
    public static final String DEMAND_TAG = "#demandId";
    public static final String MDO_NAME_TAG= "#mdoName";
    public static final String PREFERRED_MAIL_BODY = "You have been preferred to create content for the request with ID #demandId from #mdoName. Please review the request details and show your interest.";
    public static final String INVALID_DEMAND_MAIL_BODY_MDO = "Your recent request with ID #demandId has been marked as invalid. Please reach out for further clarification.";
    public static final String DEMAND_INVALID_SUB ="Invalid Request #demandId.";
    public static final String DEMAND_ASSIGNED_SUB ="Request Assigned #demandId.";
    public static final String SINGLE ="Single";
    public static final String BODY = "body";
    public static final String INVALID = "Invalid";
    public static final String ASSIGNED_MAIL_BODY_TO_MDO  = "Your request with ID #demandId has been assigned to #contentProviderName. They will be handling your content needs.";
    public static final String ASSIGNED_MAIL_BODY_TO_CBP = "You have been assigned to create content for the request with ID #demandId from #mdoName . Please review the request details and proceed with the content creation process.";
    public static final String IS_SPV_REQUEST = "isSpvRequest";
    public static final String CONTENT_PROVIDER_NAME_TAG = "#contentProviderName";
    public static final String SPV_ADMIN ="SPV_ADMIN";
    public static final String ROLES = "roles";
    public static final String INTEREST_ID_MISSING = "InterestId is not present";
    public static final String DEMAND_ID_MISSING = "DemandId is not present";
    public static final String PROVIDER_ID_TO_VALIDATE= "providerIdsToValidate";
    public static final String ASSIGNED_PROVIDER_ID= "assignedProviderId";
    public static final String CONTENT_ID= "contentId";
    public static final String IN_PROGRESS= "InProgress";
    public static final String SEARCHTAGS = "searchTags";
    public static final String OWNER_ORG_NAME = "ownerOrgName";
    public static final String CIOS_INDEX_NAME= "cios_content_entity";
    public static final String ID_PREFIX = "ext_";
    public static final String LAST_UPDATED_ON = "lastUpdatedOn";
    public static final String COMPETENCY = "competencyArea";
    public static final Boolean ACTIVE_STATUS_FALSE = false;
    public static final String OWNER_NAME = "ownerName";
    public static final String INTEREST_ORG_SET ="interestOrgSet";
    public static final String SEARCH_OPERATION_LESS_THAN = "<";
    public static final String SEARCH_OPERATION_GREATER_THAN = ">";
    public static final String SEARCH_OPERATION_LESS_THAN_EQUALS = "<=";
    public static final String SEARCH_OPERATION_GREATER_THAN_EQUALS = ">=";
    public static final String EXPIRED_ON = "expiredOn";
    public static final String MUST= "must";
    public static final String FILTER= "filter";
    public static final String MUST_NOT="must_not";
    public static final String SHOULD= "should";
    public static final String BOOL="bool";
    public static final String TERM="term";
    public static final String TERMS="terms";
    public static final String MATCH="match";
    public static final String RANGE="range";
    public static final String UNSUPPORTED_QUERY="Unsupported query type";
    public static final String UNSUPPORTED_RANGE= "Unsupported range condition";
    public static final String FACETS = "facets";
    public static final String COUNT = "count";
    public static final String ORG = "org";
    public static final String SPV_ORG_NAME = "Karmayogi Bharat";
    public static final String INVALID_DATA = "No data found";
    public static final String ENROLLMENT_VALIDATION_FILE_JSON = "/payloadValidation/orgBookmarkUpdateValidation.json";
    public static final String TABLE_USER_EXTERNAL_ENROLMENTS_T1 = "user_external_enrolments_t1";
    public static final String ENROLLED_DATE = "enrolled_date";
    public static final String COURSE_ID_RQST = "courseId";

    private Constants() {
    }
}
